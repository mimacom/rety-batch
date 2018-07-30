package com.mimacom.rety.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class ProductProcessor implements ItemProcessor<Product, Product> {
    private static final Logger log = LoggerFactory.getLogger(ProductProcessor.class);

    @Override
    public Product process(final Product product) throws Exception {

//        if (product.brand.equals("Apple") && product.title.contains("Watch")) {
//            log.info("Process (" + product.asins + ")");
//        }

        return product;
    }
}