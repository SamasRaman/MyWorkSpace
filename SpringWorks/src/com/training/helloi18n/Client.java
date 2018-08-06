package com.training.helloi18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Client {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Greeting greetingFrench=context.getBean("french",Greeting.class);
		System.out.println(greetingFrench.greetHello());
		
		Greeting greetingEnglish=context.getBean("english",Greeting.class);
		System.out.println(greetingEnglish.greetHello());
	}
}
