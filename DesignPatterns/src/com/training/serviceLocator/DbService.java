package com.training.serviceLocator;

public class DbService implements IService
{

	@Override
	public String getName() {
		
		return "DB Service";
	}

	@Override
	public void execute() {
		System.out.println("We are executing db service");
		
	}

}
