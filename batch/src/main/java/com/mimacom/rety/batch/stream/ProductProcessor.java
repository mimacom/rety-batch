package com.mimacom.rety.batch.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface ProductProcessor {

    @Output
    MessageChannel productsOut();
}
