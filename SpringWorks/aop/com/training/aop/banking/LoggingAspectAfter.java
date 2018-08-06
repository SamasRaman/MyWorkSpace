package com.training.aop.banking;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspectAfter {
    @After("execution(* get*())")
	public void afterGetter() {
		System.out.println("$$$$$$$  After Advice Invoked  $$$$$");
	}

    @AfterReturning("execution(* com.training.aop.model.SBAccount.getAcc())")
	public void afterSuccessfulGetter() {
		System.out.println("$$$$$$$  After Successful Return  $$$$$");
	}
    
    @AfterReturning(pointcut="args(val)",returning="returnString")
    public void afterReturnString(String val,String returnString) {
    	
    	System.out.println("After Invokerd for input "+val +",return "+returnString);
    }
    
    @AfterThrowing("execution(* throw*())")
	public void afterException() {
		System.out.println("$$$$$$$This will throw all exceptions  $$$$$");
	}
    
}
