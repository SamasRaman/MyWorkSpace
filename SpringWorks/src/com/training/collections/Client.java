package com.training.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.autowire.AppConfig2;
import com.training.autowire.Mobile;

public class Client {
	
	public static void main(String[] args) {
		
ApplicationContext context=new ClassPathXmlApplicationContext("collection-context.xml");
		
		
		
		
		MyCollection myCollection=context.getBean("myCollection",MyCollection.class);
		
		
		System.out.println(myCollection.getQuestionBank());
		System.out.println(myCollection.getAddressSet());
		System.out.println(myCollection.getAccountMap());
	}

}
