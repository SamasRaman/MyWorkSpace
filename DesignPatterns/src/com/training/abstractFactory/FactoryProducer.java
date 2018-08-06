package com.training.abstractFactory;

public class FactoryProducer {
    //this method is not made static the every time the instance is creted 
	//it is loaded in the heap which would run costly.
	//these kind of methods are called resource intensive
	
	public static AbstractFactory getFactory(String factoryName) {
		if(factoryName.equals("vehicle")) {
			return new VehicleFactory();
		}
		else if(factoryName.equals("color")) {
			return new ColorFactory();
		}
		return null;
	}
}
