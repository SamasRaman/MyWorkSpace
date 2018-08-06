package com.training.serviceLocator;

public class Client {
public static void main(String[] args) {
	
	IService dbservice=ServiceLocator.getService("db");
	dbservice.execute();
	
	System.out.println("............................");
	IService erpservice=ServiceLocator.getService("erp");
	erpservice.execute();
	
	System.out.println("............................");
    dbservice=ServiceLocator.getService("db");
	dbservice.execute();
}
}
