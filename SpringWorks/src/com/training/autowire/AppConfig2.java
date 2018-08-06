package com.training.autowire;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages="com.training.autowire")
public class AppConfig2 {

//	@Bean(name="camera")
//	public Camera camera() {
//		return new Camera();
//		
//	}
//	
//	
//	@Bean(name="screen")
//	public Screen screen() {
//		return new Screen();
//		
//	}
//	
//	@Bean(name="speaker")
//	public Speaker speaker() {
//		return new Speaker();
//		
//	}
//	
//	@Bean(name="mobile")
//	public Mobile mobile() {
//		return new Mobile();
//		
//	}
	@Bean
	public static PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
		
		PropertyPlaceholderConfigurer propertyPlaceholderConfigurer=new PropertyPlaceholderConfigurer();
		
		Resource resource=new ClassPathResource("mobile.properties");
		propertyPlaceholderConfigurer.setLocation(resource);
		return propertyPlaceholderConfigurer;
		
		
		
	}
}
