package com.exilant.training.kafka;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ser.std.StringSerializer;

public class KafkaPublisher1Application {

	public static void main(String[] args) {
		
		
		Properties props=new Properties();
		props.setProperty("bootstrap.servers", "localhost:9092");
		props.setProperty("key.serializer", StringSerializer.class.getName());
		props.setProperty("value.serializer", StringSerializer.class.getName());
		props.setProperty("acks", "1");
		props.setProperty("retries", "3");
		
		Producer<String, String> producer=new KafkaProducer<String,String>(props);
		
		ProducerRecord<String, String> producerRecord=new ProducerRecord<String, String>("test","1","Testing Message From Java");
		
		producer.send(producerRecord);
		producer.flush();
		producer.close();
		
	}
}
