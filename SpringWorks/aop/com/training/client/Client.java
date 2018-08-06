package com.training.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.aop.service.BankingService;

public class Client {
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("spring-aop-context.xml");

		BankingService service=context.getBean("banking",BankingService.class);

		System.out.println(service.getCaAccount().getAcc());
		System.out.println(service.getSbAccount().getAcc());

//		String retVal=service.setAndGet("harry");
//		System.out.println("Returning val in main"+retVal);
//
//		service.throwSomeException();

		//		System.out.println(service.getSbAccount().getAcc().getBalance());
		//		System.out.println(service.getCaAccount().getAcc().getBalance());
		//		System.out.println(service.getCaAccount().showBalance());

	}
}
