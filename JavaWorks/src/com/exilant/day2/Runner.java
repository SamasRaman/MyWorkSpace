package com.exilant.day2;

public class Runner {
	public void execute( WorkerInterface workerInterface){
		System.out.println("In Execute Method");
		workerInterface.doSomeWork();
	}

}
