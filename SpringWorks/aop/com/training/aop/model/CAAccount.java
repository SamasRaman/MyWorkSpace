package com.training.aop.model;

public class CAAccount {
	
	private Account acc;
	
	

	@Override
	public String toString() {
		return "CAAccount [acc=" + acc + "]";
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	public double showBalance() {
		return acc.getBalance();
	}
	
	void getTest() {
		System.out.println("Default call");
	}

}
