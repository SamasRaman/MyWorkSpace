package com.training.abstractFactory;
//this class is also acting like adapter pattern
//which is giving the implementation for the classes which are required
public class ColorFactory extends AbstractFactory{

	//no implementation of vehicle
	@Override
	public IVehicle getVehicle(String vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IColor getColor(String color) {
		if(color.equals("red")) {
		return new Red();	
		}
		else if(color.equals("blue")) {
			return new Blue();	
			}
		return null;
	}

}
