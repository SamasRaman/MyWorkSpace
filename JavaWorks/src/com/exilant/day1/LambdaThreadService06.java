package com.exilant.day1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LambdaThreadService06 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				System.out.println("Hi i am a Anonymous Block");
				
			}
			
		});
		executorService.shutdown();
		
		//java 8 way
		ExecutorService executorService1=Executors.newSingleThreadExecutor();
		executorService1.execute(()->{
			System.out.println("Hi i am Lambda Block");
		
		});
		executorService1.shutdown();
		
		System.out.println("......callables work.......");
		ExecutorService executorService2=Executors.newSingleThreadExecutor();
		Set<Callable<String>> callables=initializeCallables();
		//String result=executorService2.invokeAny(callables);
		
			List<Future<String>>  results=executorService2.invokeAll(callables);
			for(Future temp : results) {
				System.out.println(temp.get());
			}
		
		executorService2.shutdown();
	}
	
	//this method will create set of callables(each callable is 1 thread)
	public static Set<Callable<String>> initializeCallables(){
		Set<Callable<String>> callables=new HashSet<Callable<String>>();
		callables.add(()-> "1st callable");
		callables.add(()-> "2nd callable");
		callables.add(()-> "3rd callable");
		callables.add(()-> "4th callable");
		callables.add(()-> "5th callable");
		
		callables.add(new Callable<String>() {
			
			@Override
			public String call() throws Exception{
				return "Callable Threads in ananymous class";
			}
			
			});
		callables.add(()->{ return "complex call business  logic";});
		return callables;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
