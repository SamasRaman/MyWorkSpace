package com.exilant.day2;

public class WorkerInterfaceTest {
	public static void main(String[] args) {
		Runner runner=new Runner();
		
		//Using AIC
		runner.execute(new WorkerInterface() {

			@Override
			public void doSomeWork() {
				System.out.println("Hi we r doing some work in main");
				
			}
			
		});
		//Using Lambda
		runner.execute(()->System.out.println("Hi i am Lamba"));
		
		//In Lambda way if multiple lines 
		runner.execute(()->{
		System.out.println("Hi i am Lamba with Multiple lines");
		System.out.println("You acn have some business logic here...");
		});
	}

}
