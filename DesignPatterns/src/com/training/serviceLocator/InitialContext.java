package com.training.serviceLocator;
//this class will work from any service
public class InitialContext {

	public Object lookup(String jndiName) {
	if(jndiName.equalsIgnoreCase("db")) {
		System.out.println("looking for db service and creating");
		return new DbService();
	}
	
	else if(jndiName.equalsIgnoreCase("erp")) {
		System.out.println("looking for ERP service and creating");
		return new ERPService();
	}
	return null;
}
}
