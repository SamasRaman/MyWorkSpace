package com.training.abstractFactory;

public interface IVehicle {
	
	void  move();
	void speed(int maxSpeed);
	void paint(IColor color);

}

class Car implements IVehicle {

	@Override
	public void move() {
		System.out.println("Car is Moving");
		
	}

	@Override
	public void speed(int maxSpeed) {
		System.out.println("max speed of car is::"+maxSpeed);
		
	}

	@Override
	public void paint(IColor color) {
		System.out.println("Car color is Red");
		
	}
	
}

class Truck implements IVehicle{

	@Override
	public void move() {
		System.out.println("Truck is Moving");
		
	}

	@Override
	public void speed(int maxSpeed) {
		System.out.println("max speed of Truck is::"+maxSpeed);
		
	}

	@Override
	public void paint(IColor color) {
		System.out.println("Truck color is Blue");
		
	}
	
}
