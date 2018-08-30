package com.exilant.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//program to shoe working with predicate
public class PredicateExample {
 public static void main(String[] args) {
	
	 Predicate<Integer> greaterThan=i -> i>10;
	 
	 Predicate<Integer> lessThan=i -> i<10;
	  
	 Predicate<Integer> positiveNumbers=i -> i>0;
	 
	 Predicate<Integer> betweenRange=i -> i>0 && i<100;
	 
	 System.out.println(greaterThan.test(100));
	 
	 
	  List<Integer> list=Arrays.asList(10,22,-10,33,2,77);
	 
	 //Passing single predicate 
	  System.out.println("....Single Predicate......");
	List<Integer> greterThan10List=filteredList(list,greaterThan);
	greterThan10List.forEach(System.out::println);
	
	 
	//we can have compound predicate passed
	System.out.println("....Compound Predicate......");
	Predicate<Integer> compoundPredicate=positiveNumbers.and(betweenRange);
	List<Integer> compoundList=filteredList(list,compoundPredicate);
	compoundList.forEach(System.out::println);
	
 }
	  
	  public static List<Integer> filteredList(List<Integer> numbers,Predicate<Integer> predicate) {
		  List<Integer> filteredList=new ArrayList<Integer>();
		  for(Integer temp : numbers) {
			  if(predicate.test(temp)) {
				  filteredList.add(temp);
			  }
		  }
	  
 return filteredList;
}
}
