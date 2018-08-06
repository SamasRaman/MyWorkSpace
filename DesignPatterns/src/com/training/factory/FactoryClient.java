package com.training.factory;

public class FactoryClient {
public static void main(String[] args) {
	
	Car car=Car.getCar(CarName.MARUTI);
	car.drive();
	
	Car car1=Car.getCar(CarName.BMW);
	car1.drive();
	
	Car car2=Car.getCar(CarName.AUDI);
	car2.drive();
}
}
