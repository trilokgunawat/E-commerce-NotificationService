package com.example.notificationservice.publisher;

import com.example.notificationservice.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherController {

    private JmsTemplate jmsTemplate;

    @Autowired
    public PublisherController(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }
    @PostMapping("/publishMessage")
    public ResponseEntity<String> publishMessage(@RequestBody Message message){
        jmsTemplate.convertAndSend("SMS", message);
        return new ResponseEntity<>("sent.", HttpStatus.OK);
    }



}
