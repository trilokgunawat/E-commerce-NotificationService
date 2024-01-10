package com.example.notificationservice.consumer;

import com.example.notificationservice.model.Message;
import jakarta.jms.MessageConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;



@Component
public class ConsumerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "SMS")
    public void messageListner(Message message){
        LOGGER.info("Message recieved {}", message);
    }
}
