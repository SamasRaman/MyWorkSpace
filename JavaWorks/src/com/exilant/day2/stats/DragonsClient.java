package com.exilant.day2.stats;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DragonsClient {
	public static void main(String[] args) {
		List<Dragons> dragonList=Stream.of(new Dragons("Errol","Usa",15),
				  							new Dragons("Errol","Usa",33),	
				  							new Dragons("hassal","Usa",15)
											).collect(Collectors.toList());
		
		//to find number of dragon
	Map<String, Long> mapDragonCount=dragonList.stream().collect(Collectors.groupingBy(Dragons :: getName,Collectors.counting()));
	System.out.println(mapDragonCount);

	
	//find some of dragons based on name
	Map<String, Integer> sumOfDragons=dragonList.stream().collect(Collectors.groupingBy(Dragons :: getName,Collectors.summingInt(Dragons :: getCount)));
	System.out.println(sumOfDragons);
	
	sumOfDragons.forEach( 
			(k,v) -> System.out.println("Dragon Name :"+k+" ,Number of Dragons :"+v));
	
	//write a snippet in java 8 should display sum of dragons
	
	int sumOfDragonscount=dragonList.stream().collect(Collectors.summingInt(Dragons :: getCount));
	System.out.println(sumOfDragonscount);
	
	//write a snippet in java 8 should display sum/average/min/max/avg of dragons
	IntSummaryStatistics stat=dragonList.stream().mapToInt((x) -> x.getCount()).summaryStatistics();
	
	System.out.println("sum is::"+stat.getSum());
	System.out.println("Average is::"+stat.getAverage());
	System.out.println("Max is::"+stat.getMax());
	System.out.println("Min is::"+stat.getMin());

	//find dragon by countrty and keep that names of dragon of different countries in the list/set
	Map<String, List<Dragons>> sumOfDragonsByCountry=dragonList.stream().collect(Collectors.groupingBy(Dragons :: getCountry));
	System.out.println(sumOfDragonsByCountry);
	}
	

}
