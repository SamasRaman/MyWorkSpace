package com.training.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.training.Employee.Employee;

//if u want spring to know this post processor
//then implement BeanPostProcessor,this way every Bean 
//when create by spring has to go through this class
public class EmployeeBeanProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("********PostProcessorBeforeInitilization");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("********PostProcessorAfterInitilization");
		
		if(bean instanceof Employee) {
			Employee emp=(Employee) bean;
			emp.setEmpName(emp.getEmpName().toUpperCase());
			return emp;
		}
		return bean;
	}

	
	
}
