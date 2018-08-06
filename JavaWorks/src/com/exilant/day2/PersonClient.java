package com.exilant.day2;

import java.util.Arrays;
import java.util.List;

public class PersonClient {
	public static void main(String[] args) {
		List<Person> personList=Arrays.asList(
				                    new Person(101,"Goutam"),
				                    new Person(101,"Rupa"),
				                    new Person(101,"Samas"),
				                    new Person(101,"Chandini")
				                    );
		personList.forEach(System.out::println);
		PersonConsumer print= new PersonConsumer();
		
		personList.forEach(print);
		personList.forEach(PrintConsumer::print);
		
		
	}

}
