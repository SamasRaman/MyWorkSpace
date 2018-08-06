package com.training.aop.banking;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspectAround {
	
	@Around("execution(public * get*())")
	public Object sampleMyAroundAdvice(ProceedingJoinPoint proceedingJointPoint) {
	
		Object retVal=null;
		
		try {
			System.out.println("Before Job Goes Here");
			retVal=proceedingJointPoint.proceed();
			System.out.println("After Job Goes Here");
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		return retVal;
		
	}

}
