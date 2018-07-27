package com.mimacom.rety.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.support.SynchronizedItemStreamReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.scheduling.annotation.EnableAsync;

import java.nio.charset.Charset;

@Configuration
@Import({
        JobCompletionNotificationListener.class
})
@EnableBatchProcessing
@EnableAsync
@PropertySource("classpath:/batch-hsql.properties")
public class BatchConfig {

    private static final Logger logger = LoggerFactory.getLogger(BatchConfig.class);

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Value("file:/Users/s.kunz/Projects/rety-batch/raw/*.csv")
    private Resource[] resources;

    @Bean
    public ItemReader<Product> csvReader() {

        MultiResourceItemReader<Product> multiResourceItemReader = new MultiResourceItemReader<Product>();
        multiResourceItemReader.setDelegate(flatFileItemReader());
        multiResourceItemReader.setResources(resources);

        SynchronizedItemStreamReader<Product> itemStreamReader = new SynchronizedItemStreamReader<>();
        itemStreamReader.setDelegate(multiResourceItemReader);

        return itemStreamReader;
    }

    private FlatFileItemReader<Product> flatFileItemReader() {

        FlatFileItemReader<Product> reader = new FlatFileItemReader<>();
        reader.setEncoding(Charset.forName("UTF-8").name());

        reader.setLineMapper(new DefaultLineMapper<Product>() {
            {
                setLineTokenizer(new DelimitedLineTokenizer() {
                    {
                        setNames(
                                "asins,parentASIN,sku,brand,author,artist,title,imagepathmedium,imagepathsmall,imagepathlarge,topcategory,ean,mpn,eanlist,mpnlist,productdescription,platforms,releasedate,eec,salerank,browsenode1,browsenode2,subcategorypath1,subcategorypath2,gender,color,size,stp,info1,info2,price1,availablity1,shipping1,salerestriction1,url1,merchantId1,PPU1,price2,availablity2,shipping2,salerestriction2,url2,merchantId2,PPU2,price3,availablity3,shipping3,salerestriction3,url3,merchantId3,PPU3,price4,availablity4,shipping4,salerestriction4,url4,merchantId4,PPU4,price5,availablity5,shipping5,salerestriction5,url5,merchantId5,PPU5,price6,availablity6,shipping6,salerestriction6,url6,merchantId6,PPU6,deltaflag"
                                        .split(",")
                        );

                        setQuoteCharacter('"');
                        setDelimiter(",");
                        setStrict(false);
                    }
                });

                setFieldSetMapper(new BeanWrapperFieldSetMapper<Product>() {
                    {
                        setTargetType(Product.class);
                    }
                });
            }
        });

        reader.setLinesToSkip(1);
        reader.setStrict(false);

        return reader;
    }

    @Bean
    ItemProcessor<Product, Product> csvProcessor() {
        return new ProductProcessor();
    }

    @Bean
    public KinesisBatchItemWriter<Product> kinesisWriter() {
        KinesisBatchItemWriter<Product> writer = new KinesisBatchItemWriter<>();

        return writer;
    }

    @Bean
    public Step csvFileToDatabaseStep() {
        return stepBuilderFactory.get("csvFileToKinesisStep")
                .<Product, Product>chunk(10)
                .reader(csvReader())
                .processor(csvProcessor())
                .writer(kinesisWriter())
//                .taskExecutor(taskExecutor())
                .build();
    }

    @Bean
    Job csvFileToKinesisJob(JobCompletionNotificationListener listener) {
        return jobBuilderFactory.get("csvFileToKinesisJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(csvFileToDatabaseStep())
                .end()
                .build();
    }

//    @Bean
//    public TaskExecutor taskExecutor() {
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        executor.setCorePoolSize(8);
//        executor.setMaxPoolSize(16);
//        executor.setQueueCapacity(100);
//
//        return executor;
//    }
}
