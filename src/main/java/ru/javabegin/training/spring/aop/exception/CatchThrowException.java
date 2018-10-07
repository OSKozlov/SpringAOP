package ru.javabegin.training.spring.aop.exception;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.ThrowsAdvice;

@Aspect
public class CatchThrowException implements ThrowsAdvice {

	@AfterThrowing(pointcut = "execution(* ru.javabegin.training.spring.aop.objects.SomeService.calculate(..))", throwing = "excep")
	public void afterThrowing(JoinPoint joinPoint, Throwable excep) throws Throwable {
		System.out.println("Inside CatchThrowException.afterThrowing() method...");
		System.out.println("Running after throwing exception...");
		System.out.println("Exception : " + excep);
	}
	
}
