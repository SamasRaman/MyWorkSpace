package com.training.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.helloi18n.AppConfig;

public class Client {
	public static void main(String[] args) {

		/*ApplicationContext context=new ClassPathXmlApplicationContext("spring-context3.xml","camera-context4.xml",
				"screen-context4.xml","speaker-context4.xml");*/

		
		//ApplicationContext context=new ClassPathXmlApplicationContext("spring-context3.xml");
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig2.class);	
		
		
		Mobile mobile=context.getBean("mobile",Mobile.class);
		System.out.println("----------------");
		System.out.println("Mobile Details::");
		System.out.println("----------------");

		System.out.println("Camera Type   ::"+mobile.getCamera().getType());

		System.out.println("Speker Details::"+mobile.getSpeaker().getType()+","+mobile.getSpeaker().getVolLevels());

		System.out.println("Screen Details::"+mobile.getScreen().getGlassType()+","+mobile.getScreen().getLen()
				+","+mobile.getScreen().getBre());

	}
}
