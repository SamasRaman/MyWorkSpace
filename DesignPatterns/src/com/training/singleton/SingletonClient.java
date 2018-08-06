package com.training.singleton;

public class SingletonClient {

	public static void main(String[] args) {
		Singleton singleton=Singleton.getInstance();
		System.out.println(singleton.hashCode());
		
		Singleton singleton1=Singleton.getInstance();
		System.out.println(singleton1.hashCode());
	}
}
