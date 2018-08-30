package com.exilant.day2;

public interface IDepartment {
	public void workLocation();
	default void noOfHrs() {
		System.out.println("The project demand to work till 6PM");
	}

}
