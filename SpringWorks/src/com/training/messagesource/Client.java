package com.training.messagesource;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.collections.MyCollection;

public class Client {

	public static void main(String[] args) {
		
ApplicationContext context=new ClassPathXmlApplicationContext("message-resource-context.xml");
		
	String engGoodMorning=context.getMessage("goodmorning", new Object[] {},null);
	
	String frGoodMorning=context.getMessage("goodmorning", new Object[] {},new Locale("FR"));
	String grGoodMorning=context.getMessage("goodmorning", new Object[] {},new Locale("GR"));
		
	System.out.println(engGoodMorning);
	System.out.println(frGoodMorning);
	System.out.println(grGoodMorning);
	
	HelloWorld helloWorld=context.getBean("helloworld",HelloWorld.class);
	helloWorld.sayHelloWorld();
	helloWorld.sayHelloWorldFr();
	helloWorld.sayHelloWorldGr();
		
	}
		

}
