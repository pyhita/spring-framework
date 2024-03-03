package com.pyhita.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/2/26
 */
@Component
@Aspect
public class LogAspect2 {

	public LogAspect2() {
		System.out.println("LogAspect .... ");
	}

	@Before("execution(* com.pyhita.aop.HelloService.sayHello(..))")
	public void logStart(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		System.out.println("logStart2 .......  ");
	}

	@AfterReturning("execution(* com.pyhita.aop.HelloService.sayHello(..))")
	public void logReturn(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		System.out.println("logReturn2 .......  ");
	}

	@After("execution(* com.pyhita.aop.HelloService.sayHello(..))")
	public void logAfter(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		System.out.println("logAfter2 .......  ");
	}

	@AfterThrowing("execution(* com.pyhita.aop.HelloService.sayHello(..))")
	public void logThrowing(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		System.out.println("logThrowing2 .......  ");
	}

	@Around("execution(* com.pyhita.aop.HelloService.sayHello(..))")
	public void logAround(ProceedingJoinPoint joinPoint) {

        try {
			System.out.println("logAround2 before .......  ");
            joinPoint.proceed();
			System.out.println("logAround2 after .......  ");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

}
