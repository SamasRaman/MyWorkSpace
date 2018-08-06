package com.training.abstractFactory;

public interface IColor {
	
	void paintCar();
}

class Red implements IColor{

	@Override
	public void paintCar() {
		System.out.println("Car Painting Color Red ");
		
	}
	
}


class Blue implements IColor{

	@Override
	public void paintCar() {
		System.out.println("Car Painting Color Blue ");
		
	}
	
}