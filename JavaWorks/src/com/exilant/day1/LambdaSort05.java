package com.exilant.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSort05 {

	public static void main(String[] args) {
		List<Customer> customer=Arrays.asList(new Customer(101,"ramu",5000,"Developer"),
				  							new Customer(101,"samas",8000,"Engineer"),
				  							new Customer(101,"alam",6000,"Network Engineer"));
				   
		System.out.println("...........Before Sort............");
		customer.forEach(System.out::println);
		
		
		System.out.println("....jdk 1.7.....");
		Collections.sort(customer,new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				// TODO Auto-generated method stub
				return o1.getCustomerName().compareTo(o2.getCustomerName());
			}
			
		});
		System.out.println(".......After sort..........");
		customer.forEach(System.out::println);
		
		//java 8
		System.out.println(".....after sort on purchase (Asc).....");
		customer.sort((Customer c1,Customer c2)->(int)(c1.getCustomersPurchases()-c2.getCustomersPurchases()));
		customer.forEach(System.out::println);
		
		//java 8 ways
		System.out.println(".....after sort on designation (Asc).....");
		customer.sort((Customer c1,Customer c2)->c1.getDesignation().compareTo(c2.getDesignation()));
		customer.forEach(System.out::println);
		
		Comparator<Customer> custAscComparator=(c1,c2)->c1.getCustomerName().compareTo(c2.getCustomerName());
		Collections.sort(customer, custAscComparator);
		System.out.println(" .....After sort on Name(ASC).....");
		customer.forEach(System.out::println);
		
		customer.sort(custAscComparator.reversed());
		System.out.println(" .....After sort on Name(Desc).....");
		customer.forEach(System.out::println);
		
		
		
		
		
	}
}
