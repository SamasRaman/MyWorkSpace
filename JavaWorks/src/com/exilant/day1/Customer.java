package com.exilant.day1;

public class Customer {
	private int customerId;
	private String customerName;
	private double customersPurchases;
	private String designation;
	
	
	
	public Customer(int customerId, String customerName, double customersPurchases, String designation) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customersPurchases = customersPurchases;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customersPurchases="
				+ customersPurchases + ", designation=" + designation + "]";
	}

	public Customer() {
		super();
	}

	public int getCustomerId() {
		return customerId;
	}
	

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getCustomersPurchases() {
		return customersPurchases;
	}

	public void setCustomersPurchases(double customersPurchases) {
		this.customersPurchases = customersPurchases;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	


}
