package com.exilant.Demo_Kafka;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;





public class App 
{
    public static void main( String[] args )
    {
    	Properties props=new Properties();
		props.setProperty("bootstrap.servers", "localhost:9092");
		props.setProperty("key.serializer", StringSerializer.class.getName());
		props.setProperty("value.serializer", StringSerializer.class.getName());
		props.setProperty("acks", "1");
		props.setProperty("retries", "3");
		
		Producer<String, String> producer=new KafkaProducer<String,String>(props);
		
		for(int i=0;i<30;i++) {
		ProducerRecord<String, String> producerRecord=new ProducerRecord<String, String>("test","1","Testing Message From Java"+i);
		System.out.println("Message sent:"+i);
		
		producer.send(producerRecord);
		}//for
		producer.flush();
		producer.close();
    }
}
