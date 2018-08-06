package com.training.Filter;

import java.util.ArrayList;
import java.util.List;

public class Client {
public static void main(String[] args) {
	List<Person> list=new ArrayList<Person>();
	list.add(new Person("Lohit","male","single"));
	list.add(new Person("Raman","male","single"));
	list.add(new Person("Kumar","male","married"));
	list.add(new Person("kavita","female","single"));
	list.add(new Person("priya","female","married"));
	
	ICriteria maleCriteria=new Males();
	System.out.println(".........Only Male........");
	maleCriteria.meetCriteria(list).forEach(System.out::println);
	
	ICriteria femaleCriteria=new Females();
	System.out.println(".........Only Female........");
	femaleCriteria.meetCriteria(list).forEach(System.out::println);
	
	ICriteria marriedCriteria=new Married();
	System.out.println(".........Only Married........");
	marriedCriteria.meetCriteria(list).forEach(System.out::println);
	
	ICriteria singleCriteria=new Single();
	System.out.println(".........Only Single........");
	singleCriteria.meetCriteria(list).forEach(System.out::println);
	
	ICriteria andCriteria=new AndCriteria(maleCriteria,singleCriteria);
	System.out.println(".........Male Single........");
	andCriteria.meetCriteria(list).forEach(System.out::println);
	
	ICriteria orCriteria=new OrCriteria(maleCriteria,singleCriteria);
	System.out.println(".........Male Or Single........");
	orCriteria.meetCriteria(list).forEach(System.out::println);
}
}
