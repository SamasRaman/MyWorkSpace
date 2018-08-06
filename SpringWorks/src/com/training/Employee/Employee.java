package com.training.Employee;

public class Employee {

	private int empId;
	private String empName;
	private double empSal;

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	public Employee() {
		System.out.println("Default Constructor for employee");
	}

	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public void init() {

		System.out.println("Init For Employee");

	}

	public void destroy() {

		System.out.println("Destroy For Employee");

	}

	public void gInit() {

		System.out.println("Global Init For Employee");

	}

	public void gDestroy() {

		System.out.println("Global Destroy For Employee");

	}

}
