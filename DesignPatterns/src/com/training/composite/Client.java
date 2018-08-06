package com.training.composite;

public class Client {
public static void main(String[] args) {
	Customer customer1=new Customer(101, "samas");
	Customer customer2=new Customer(102, "Lohit");
	Customer customer3=new Customer(103, "Ramana");
	Customer customer4=new Customer(104, "Tejaswini");
	Customer customer5=new Customer(105, "Ravi");
	Customer customer6=new Customer(106, "Akkamahadevi");
	
	customer1.addReferences(customer2);
	customer1.addReferences(customer3);
	customer2.addReferences(customer4);
	customer2.addReferences(customer5);
	
	customer4.addReferences(customer6);
	System.out.println("print all customer reference tree");
	System.out.println("customer1's Reference  "+customer1.getCustName());
	
	for(Customer cust : customer1.getReferences()) {
		System.out.println(cust.getCustId()+"..."+cust.getCustName());
	}
}

}
