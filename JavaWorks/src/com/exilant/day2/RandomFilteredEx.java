package com.exilant.day2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class RandomFilteredEx {

	public static void main(String[] args) {
		//this will generate one random number
	int randomNumber=ThreadLocalRandom.current().nextInt();
	
	System.out.println(randomNumber);
	
	System.out.println("....Unsorted order......");
	Random random=new Random();
	random.ints(10,100,200).forEach(System.out::println);
	System.out.println("....sorted order......");
	//we want sorted order
	random.ints(10,100,200).sorted().forEach(System.out::println);
	
	System.out.println("Sum is::"+random.ints(10,100,200).sum());
	//to generate nums using Stream
	System.out.println("....20 nums Asc.....");
	Stream.iterate(10,i->i+1).limit(20).sorted().forEach(System.out::println);
	}
	
	
}
