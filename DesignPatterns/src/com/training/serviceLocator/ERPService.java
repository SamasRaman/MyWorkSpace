package com.training.serviceLocator;

public class ERPService implements IService{

	@Override
	public String getName() {
		
		return "ERP Service";
	}

	@Override
	public void execute() {
		System.out.println("Executing ERP Service");
	}

}
