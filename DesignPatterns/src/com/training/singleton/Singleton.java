package com.training.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {
	private static final Singleton instance= new Singleton();

	private Singleton() {


		System.out.println("The Constructor is Called");
	}

	public static Singleton getInstance() {
		return instance;
	}

	//to avoid from deserialization which returns another object

	protected Object readResolve() {
		return getInstance();

	}

}
