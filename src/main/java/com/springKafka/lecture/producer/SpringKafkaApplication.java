package com.springKafka.lecture.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringKafkaApplication {
	//kafka-topics --bootstrap-server localhost:9092 --create --partitions 3 --topic UserV1
	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaApplication.class, args);
	}

}
