package com.training.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class ReadMovieTweets {
	
	public static void main(String[] args) {
		
		
		String appName="sampleApp";
		String sparkMaster="local[2]";
		
		
		JavaSparkContext spContext=null;
		SparkConf conf=new SparkConf().clone().
				setAppName(appName).
				setMaster(sparkMaster);
		
		spContext=new JavaSparkContext(conf);
		
		JavaRDD<String> tweetsRDD=spContext.textFile("./data/movietweets.csv");
		
		tweetsRDD.take(5).forEach(System.out::println);
		
		int count=(int) tweetsRDD.count();
		System.out.println("Number of tweets are::"+count);
		
		JavaRDD<String> upperCaseRDD=tweetsRDD.map(temp -> temp.toUpperCase());
			
		upperCaseRDD.
				take(10).forEach(System.out::println);
		
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}
