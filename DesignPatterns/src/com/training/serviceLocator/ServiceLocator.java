package com.training.serviceLocator;

public class ServiceLocator {
 private static Cache cache;
 
 static {
	 cache=new Cache();
 }
 
 public static IService getService(String jndiName) {
	 IService service=cache.getService(jndiName);
	 if(service!=null) {
		 return service;
	 }
	 
	 InitialContext context=new InitialContext();
	 IService nservice=(IService) context.lookup(jndiName);
	 cache.addService(nservice);
	 return nservice;
	 
 }
}
