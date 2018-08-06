package com.training.aop.banking;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	//this will scan any package and any class
	//	@Before("execution(public double getBalance())")
	//	public void loggingAdviceBefore() {
	//		System.out.println("********Logging Before Called*******");
	//	}
	//	

	//	@Before("execution(public double com.training.aop.model.CAAccount.showBalance())")
	//	public void loggingAdviceBefore() {
	//		System.out.println("********Logging Before Called*******");
	//	}

	//regex for taking one param
	//@Before("execution(* get*(*))")

	//Getting all getters having param or not
	//@Before("execution(* get*(..))")


	//any return type in any class of package com.training.aop.model 
	//@Before("execution(* com.training.aop.model.*>getBalance(..))")

	//Log all getters
	//	@Before("execution(* get*())")
	//	public void loggingAdviceBefore() {
	//		System.out.println("********Logging Before Called*******");
	//	}

	@Before("allGetters()")
	public void secondAdvise() {
		System.out.println("Second Aspect Invoked for all getters");
	}


	@Before("allGettersSBAccount() ")
	public void secondAdviseForSbAccount() {
		System.out.println("SecondAdviseForSbAccount Aspect Invoked for all getters");
	}


	@Before("allGetters() || allGettersSBAccount() ")
	public void compountAdvise() {
		System.out.println("compountAdvise Aspect Invoked for all getters");
	}

	@Pointcut("execution(* get*(..))")
	public void allGetters() {
		System.out.println("This data should not be display");
	}

	@Pointcut("execution(* com.training.aop.model.SBAccount.getAcc())")
	public void allGettersSBAccount() {
		System.out.println("This data should not be display");
	}


	//	@After("execution(public double getBalance())")
	//	public void loggingAdviceAfter() {
	//		System.out.println("********Logging After Called*******");
	//	}



}
