package com.exilant.day1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaBasic01 {
	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(10,20,30,40,50,60);

		int sum=0;

		//java 1.5
		System.out.println(".......before jdk 1.5.........");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

		//post 1.5
		System.out.println(".......before jdk 1.5.........");
		for(Integer temp : list) {
			System.out.println(temp);
		}
		//java 8 lambda expression
		System.out.println("........lambda Expression.......");
		list.forEach((Integer temp) ->	
		System.out.println(temp));

		//Behind the screen
		System.out.println("......with consumer.........");
		list.forEach(new Consumer<Integer>() {


			@Override
			public void accept(Integer t) {
				System.out.println(t);

			}
		});

		//In lambda way 1.8
		System.out.println("........in lambda way(01)............");
		list.forEach((temp)->System.out.println(temp));

		//this is called method reference
		System.out.println("........in lambda way(02)............");
		list.forEach(System.out::println);

		//find sum of nos
		System.out.println("....find sum of nos.....");
		int result=0;
		for(int temp : list) {
			result+=temp*2;
		}
		System.out.println("Result "+result);

		System.out.println("........java 8........");
		System.out.println(list.stream().map(e->e*2).reduce((res,e)->res+e));

        















	}


}


