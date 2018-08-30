package com.exilant.day1;

public class lambdaUsingThread04 {
	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				
				System.out.println("hii i am annanymous call....");
			try {
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("ananymous call exiting");
			}
		}).start();
		
		/////////Lambda Based////////////////
		
		new Thread(()->
		{
		System.out.println("hii i am lambda");
		try {
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("lambda call exiting");
			
			
		}).start();;
		}
	}


