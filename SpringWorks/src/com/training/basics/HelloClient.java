package com.training.basics;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class HelloClient {
	public static void main(String[] args) {
		
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring-context.xml"));
		
		//ApplicationContext context=new ApplicationContext(new ClassPathResource("spring-context.xml"));
		
		HelloService helloService=(HelloService) factory.getBean("defaultHello");
		
		System.out.println(helloService.sayHello());
	}

}
