package com.mimacom.rety.batch;

import com.mimacom.rety.batch.stream.ProductsSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class KinesisBatchItemWriter<Product> implements ItemWriter<Product>, InitializingBean {

    protected static final Log logger = LogFactory.getLog(JdbcBatchItemWriter.class);

    @Autowired
    private ProductsSource productsSource;

    @Override
    public void write(List<? extends Product> items) throws Exception {

        items.forEach(product -> {
            productsSource.sendProduct((com.mimacom.rety.batch.Product) product);
        });

//        logger.info("Write: " + items.toString());
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
