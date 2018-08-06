package com.training.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//Program to access singleton(Eager) through reflection

public class SingletonClient03 {
	
public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
	Singleton singleton1=Singleton.getInstance();
	
	Singleton singleton2=null;
	
	Singleton singleton3=null;
	
	Constructor [] constructors=Singleton.class.getDeclaredConstructors();
	  
	for(Constructor constructor : constructors) {
		
	//will this statement we can access private methods
		//or constructors
		constructor.setAccessible(true);
		singleton2=(Singleton) constructor.newInstance();
		singleton3=(Singleton) constructor.newInstance();
		break;
	
	}
	System.out.println("Instance one hashcode   "+singleton1);
	System.out.println("Instance two hashcode   "+singleton2);
	System.out.println("Instance three hashcode   "+singleton3);
	
	
	
}
}
