package com.exilant.day2;

public class ExilantEmployee implements IEmployee,IDepartment {

	@Override
	public void salary() {
		System.out.println("The Salary is based on Performance");
		
		
	}

	@Override
	public void noOfHrs() {
		
		IEmployee.super.noOfHrs();
	}

	@Override
	public void workLocation() {
		System.out.println("Work location is bangalore");
		
	}

}
