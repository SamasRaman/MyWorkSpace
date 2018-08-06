package com.exilant.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonPredicate {
	public static void main(String[] args) {
		
		
		
		List<Person> list=Arrays.asList(new Person(101,"samas"),
										new Person(101,"samas"),
										new Person(101,"samas"));
	
		 Predicate<Person> isPersonGreterThan101=i -> i.getpId()>101; 
		
		List<Person> filteredPersons=filteredList(list,isPersonGreterThan101);
		filteredPersons.forEach(System.out::println);
	}
	
			 public static List<Person> filteredList(List<Person> persons,Predicate<Person> predicate) {
				  return persons.stream().filter(predicate).collect(Collectors.toList());
				  }
			 
			
			  
		 
		}
			
			

