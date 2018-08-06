package com.exilant.KafkaWorks;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;



public class Producer extends Thread {
	
	private final KafkaProducer<Integer,String> producer;
	private String topic;
	private Boolean isAsync;
	private boolean interupt;
	private String name;
	public Producer(String topic, Boolean isAsync,String name) {
	
		this.topic = topic;
		this.isAsync = isAsync;
		this.name=name;
		interupt = false;
		
		Properties props=new Properties();
		props.setProperty("bootstrap.servers", KafkaProperties.KAFKA_SERVER_URL+":"
				+KafkaProperties.KAFKA_SERVER_PORT);
		props.setProperty("client.id", KafkaProperties.PRODUCER_CLIENT_ID);
		
		props.setProperty("key.serializer", IntegerSerializer.class.getName());
		props.setProperty("value.serializer", StringSerializer.class.getName());
		
		producer=new KafkaProducer<Integer,String>(props);
		
	}
	
	public void run() {
		
		int messageNo=1;
		
		while(!interupt) {
			String messageString="Message From Producer "+this.name +"Count :"+messageNo;
			
			if(isAsync) {
				ProducerRecord<Integer,String> producerRecord=new ProducerRecord<Integer,
						String>(this.topic,messageNo,messageString);
				long startTime=System.currentTimeMillis();
				producer.send(producerRecord,new ProducerMessageCallable(startTime,messageNo,messageString)
				);
			}else {
			try {	
				ProducerRecord<Integer,String> producerRecord=new ProducerRecord<Integer,
						String>(this.topic,messageNo,messageString);
				producer.send(producerRecord).get();
				
			}catch(InterruptedException | ExecutionException e)	{
				e.printStackTrace();
			}
			
			}
			messageNo++;
			
		}
		
	}

	public void setInterrupt(boolean b) {
		
		
	}

	
}
