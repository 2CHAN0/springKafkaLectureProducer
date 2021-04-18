package com.springKafka.lecture.producer.controller;

import com.springKafka.lecture.producer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {

    @Autowired
    private KafkaTemplate<String, User> userKafkaTemplate;

    private static final String TOPIC = "UserV1";

    @PostMapping("/publish")
    public String post(@RequestBody User user){
        userKafkaTemplate.send(TOPIC, user);
        return "User is registered !!";
    }
}
