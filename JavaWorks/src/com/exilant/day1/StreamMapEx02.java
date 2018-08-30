package com.exilant.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//to show working of map and filter based on the customer type
public class StreamMapEx02 {
	
	public static List<PriorityCustomer>  filtersCustomers1(List<Customer> customers){
		List<PriorityCustomer> priorityCustomers=customers.stream().map(temp ->{
			return new PriorityCustomer(temp.getCustomerId(),temp.getCustomerName(),temp.getCustomersPurchases()<3000?"silver":
				temp.getCustomersPurchases()>3000 && temp.getCustomersPurchases()<5000?"Gold":"Platinum"
					);
			
	}).collect(Collectors.toList());
		return priorityCustomers;
		}
	
	
	public static List<PriorityCustomer>  filtersCustomers2(List<Customer> customers){
		return customers.stream().filter(temp -> temp.getCustomersPurchases()>5000)
				.map(temp ->{
					return new PriorityCustomer(temp.getCustomerId(),temp.getCustomerName(),"Gold");	
	}).collect(Collectors.toList());
		
		}
	
	public static void main(String[] args) {
		List<Customer> list=Arrays.asList(new Customer(101,"Ramu",6000,"Engineer"),
				new Customer(101,"samas",8000,"Engineer"),
				new Customer(101,"abdul",4000,"Developer"));

	 filtersCustomers1(list).forEach(System.out::println);
	}

}
