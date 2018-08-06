package com.training.singleton;
//to shoe lazy singleton

 class Company {
	private static final Company company=null;

	private Company() {
		System.out.println("The Constructor is Called");
	}
	
	public static Company getInstance() {
		if(company==null) {
			return new Company();
		}
		return company;
	}

}
 
 class Emp{
	 int empId;
	 String empName;
	 Company company;
 }


public class SingletonClient02 {
    public static void main(String[] args) {
    	
		//we cant creatre instance of variable
    	//Company company=new Company();
    	
    	Company company=null;
    	
    	company=Company.getInstance();
    	Emp emp=new Emp();
    	emp.empId=101;
    	emp.empName="Ankit";
    	emp.company=company;
    	System.out.println(emp.company.hashCode());
    	
    	Emp emp1=new Emp();
    	emp1.empId=102;
    	emp1.empName="Akshya";
    	emp1.company=company;
    	System.out.println(emp1.company.hashCode());
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
}
