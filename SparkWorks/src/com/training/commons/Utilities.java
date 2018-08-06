package com.training.commons;

import org.apache.spark.api.java.JavaRDD;

public class Utilities {
	
	public static void printStringRDD(JavaRDD<String> stringRDD,int limit){
		
		for(String temp: stringRDD.take(limit)) {
		System.out.println(temp);
		
	}
	}
	
	public static void hold() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
