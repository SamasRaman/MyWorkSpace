package com.training.spark;

import java.util.Arrays;

import org.apache.spark.api.java.function.Function;

public class ClenseRDDCars implements Function<String,String> {
	
	

	@Override
	public String call(String v1) throws Exception {
		
	String[] attributeList=v1.split(",");
	
	//change character to number
	attributeList[3]=(attributeList[3].equals("two"))?"2":"4";
	
	//to change car type to upper
	attributeList[4]=attributeList[4].toUpperCase();
		return Arrays.toString(attributeList);
	}

}
