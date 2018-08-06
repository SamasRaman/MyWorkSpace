package com.training.spark;

import java.util.Arrays;

import org.apache.spark.api.java.function.Function;

public class MPGWorks implements Function<String,Double> {
	
	double totalMPGCity;
	int totalMPGHwy;

	@Override
	public Double call(String v1) throws Exception {
		
	String[] attributeList=v1.split(",");
	
	
	totalMPGCity=Double.parseDouble(attributeList[9]);
	
	//totalMPGHwy=Integer.parseInt(attributeList[10]);
	
	
		return totalMPGCity;
	}
	
	public double getAverageMPGCity(int count) {
		return totalMPGCity/count;
	}
	
	public double getAverageMPGHwy(int count) {
		return totalMPGHwy/count;
	}

}