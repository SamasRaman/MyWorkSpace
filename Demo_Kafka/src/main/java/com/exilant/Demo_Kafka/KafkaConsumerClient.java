package com.exilant.Demo_Kafka;

import java.util.Arrays;
import java.util.Date;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

public class KafkaConsumerClient {
	
	public static void main(String[] args) {
		
	Properties props=new Properties();
	props.setProperty("bootstrap.servers", "localhost:9092");
	props.setProperty("key.deserializer", StringDeserializer.class.getName());
	props.setProperty("value.deserializer", StringDeserializer.class.getName());


			props.setProperty("group.id", "FirstGroup"); 
			
			props.setProperty("session.timeout.ms", "30000"); 
			props.setProperty("auto.offset.reset", "earliest"); 
			
			
			KafkaConsumer<String, String> 
				kafkaConsumer = new KafkaConsumer
					<String, String>(props);
			

			kafkaConsumer.subscribe(Arrays.asList("test"));
			
			while(true) {
				
				ConsumerRecords<String, String> 
					consumerRecords = kafkaConsumer.poll(1000); 
				
				System.out.println("Count Number of Messages Got " + 
						consumerRecords.count());	
				
				for(ConsumerRecord<String, String> temp : 
						consumerRecords) {
					
					System.out.println(
						"Key: " + temp.key() + 
						", Value: " + temp.value() +
						", Partition: " + temp.partition() +
						", Topic " + temp.topic() +
						", Time :" + new Date(temp.timestamp())
							);
					
				}
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			

	

	}
	
}
