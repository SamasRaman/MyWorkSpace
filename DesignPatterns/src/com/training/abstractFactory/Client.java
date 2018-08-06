package com.training.abstractFactory;

public class Client {
	public static void main(String[] args) {
		AbstractFactory vehicleFactory=FactoryProducer.getFactory("vehicle");
		IColor redColor=FactoryProducer.getFactory("vehicle").getColor("red");
		IVehicle fordCar=vehicleFactory.getVehicle("car");
		fordCar.move();
		fordCar.speed(120);
		
		
		IVehicle manTruck=vehicleFactory.getVehicle("truck");
		manTruck.move();
		manTruck.speed(120);
		manTruck.paint(redColor);
		 
		
	}

}
