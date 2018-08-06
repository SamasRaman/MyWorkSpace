package com.training.spark;


import java.util.Arrays;
import java.util.Iterator;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.AbstractJavaRDDLike;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;

import com.training.commons.DataSource;
import com.training.commons.SparkConnection;
import com.training.commons.Utilities;

public class SparkOperationsClient {
 public static void main(String[] args) {
	
	// Logger.getLogger("org").setLevel(Level.ERROR);
	 Logger.getLogger("org").setLevel(Level.ERROR);
	 Logger.getLogger("akka").setLevel(Level.ERROR);
	 
	 JavaSparkContext sparkContext=SparkConnection.getContext();
	 //start loading data
	 
	 //load the collection and cache it
	 JavaRDD<Integer> collData=DataSource.getCollData();
	 System.out.println("No Of Records::"+collData.count());
	 
	 //load the file and cache it
	 JavaRDD<String> autoDataContent=sparkContext.textFile("./data/auto-data.csv");
	 
	 System.out.println("No Of Records::"+autoDataContent.count());
	 
	 Utilities.printStringRDD(autoDataContent, 10);
	 
	 
	//autoDataContent.saveAsTextFile("./data/auto-data-modified.csv");
	
	System.out.println("TSV Format..");
	JavaRDD<String> tsvData=autoDataContent.map(str ->  str.replace(",","\t"));
	Utilities.printStringRDD(tsvData, 10);
	
	//JavaRDD<String> autoDataWithOutHeader=
		//	autoDataContent.filter(s -> !s.equals(header));
	
	JavaRDD<String> toyotaData=autoDataContent.filter(str->str.contains("toyota"));
	System.out.println("Only Toyota");
	
	Utilities.printStringRDD(toyotaData, 10);
	

	JavaRDD<String> uniqueData=autoDataContent.distinct();
	System.out.println("Only Unique");
	
	Utilities.printStringRDD(uniqueData, 10);
	
	JavaRDD<String> words=toyotaData.flatMap(new FlatMapFunction<String,String>(){
		
		@Override
		public Iterator<String> call(String t)throws Exception
		{
			return Arrays.asList(t.split(",")).iterator();
		}
	
	
		
	});
	System.out.println("ToyotaRDD word Count :"+words.count());
	
	//after cleansing the data
	System.out.println("*******After Cleansing*******");
	
	JavaRDD<String> cleanseRDD=autoDataContent.map(new ClenseRDDCars());
	Utilities.printStringRDD(cleanseRDD, 5);
	
	//set Operations
	JavaRDD<String> words1=sparkContext.parallelize(
			Arrays.asList("hello","how","are","you","today"));
	
	JavaRDD<String> words2=sparkContext.parallelize(
			Arrays.asList("hello","how","were","yesterday"));
	
	System.out.println("Union Operatiuons -set");
	Utilities.printStringRDD(words1.union(words2), 9);
	
	System.out.println("Intersection Operatiuons -set");
	Utilities.printStringRDD(words1.intersection(words2), 9);
	
	//3,4,45,66,77,98,65=358
	Integer autoDataContentCount=collData.reduce((x,y) -> x+y);
	System.out.println("Sum of Given Integers  :"+autoDataContentCount);
	
//	  AbstractJavaRDDLike<Integer, JavaRDD<Integer>> autoDataWithOutHeader;
//	  
//	JavaRDD<Integer> totalMPG=autoDataWithOutHeader.map(new MPGWorks()).collect();
}
}
