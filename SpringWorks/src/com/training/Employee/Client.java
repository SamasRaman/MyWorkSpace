package com.training.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.basics.HelloService;

public class Client {
	public static void main(String[] args) {
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("spring-context2.xml");
		
		//To invoke Destroy method
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml","spring-context2.xml");
		Employee employee=context.getBean("employee",Employee.class);
		System.out.println(employee);
		System.out.println(employee.hashCode());
		
		System.out.println("---------------------------");
		
		Employee employee1=context.getBean("employee",Employee.class);
		System.out.println(employee1);
		System.out.println(employee1.hashCode());
		
		HelloService service=(HelloService) context.getBean("defaultHello");
		System.out.println(service.sayHello());
		
		context.registerShutdownHook();
	}

}
