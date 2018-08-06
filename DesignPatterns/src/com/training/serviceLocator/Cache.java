package com.training.serviceLocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
 private List<IService> services;
  public Cache() {
	  services=new ArrayList<IService>();
  }
  
  public IService getService(String serviceName) {
	  for(IService service : services) {
		  if(service.getName().equalsIgnoreCase(serviceName)) {
			  System.out.println("Returning Cached SErvice:: "+serviceName+"Object");
			  
		  }
		  return service;
	  }
	return null;
	  
  }
  
  public void addService(IService newService) {
	  boolean exist=false;
	  for(IService service : services) {
		  if(service.getName().equalsIgnoreCase(newService.getName())) {
			  exist=true;
		  }
	  }
	  if(!exist) {
		  services.add(newService);
	  }
	  
  }
}
