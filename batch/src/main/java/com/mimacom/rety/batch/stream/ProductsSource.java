package com.mimacom.rety.batch.stream;

import com.mimacom.rety.batch.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

@Component
public class ProductsSource {

    private static final Logger logger = LoggerFactory.getLogger(ProductsSource.class);

    private ProductProcessor productOut;

    @Autowired
    public ProductsSource(ProductProcessor productOut) {
        this.productOut = productOut;
    }

    public void sendProduct(Product product) {
        productOut.productsOut().send(new GenericMessage<>(product));
//        logger.info("Event sent: " + product.toString());
    }
}
