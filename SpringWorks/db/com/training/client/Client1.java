package com.training.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.entity.Employee;
import com.training.interfaces.IEmployeeDao;

public class Client1{
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("db-context.xml");

		IEmployeeDao dao=(IEmployeeDao) context.getBean("employeeDaoTemplate");
		System.out.println("hello");
		//insert employee
		//Employee emp=new Employee(221,"Tanmayee", 40000);

		//dao.insertEmployee(emp);
		//Employee emp=dao.getEmployee(102);
		//System.out.println(emp);
		

//		List<Employee> list=dao.getAllEmps();
//
		//System.out.println(list);
		
		
		dao.deleteEmployee(105);

	}

}
