package com.training.abstractFactory;

public abstract class AbstractFactory {
//here the list of factories to be exposed
	
	public abstract IVehicle getVehicle(String vehicle);
	public abstract IColor getColor(String color);
}
