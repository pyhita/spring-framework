package com.pyhita.aop;

import java.util.Arrays;
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
public class LogAspect {

	public LogAspect() {
		System.out.println("LogAspect .... ");
	}

	@Before("execution(* com.pyhita.aop.HelloService.sayHello(..))")
	public void logStart(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		System.out.println("logStart()==> " + name + " .... [args: " + joinPoint.getArgs() + "]");
	}

	@AfterReturning("execution(* com.pyhita.aop.HelloService.sayHello(..))")
	public void logReturn(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		System.out.println("logReturn()==> " + name + " .... [args: " + joinPoint.getArgs() + "]");
	}

	@After("execution(* com.pyhita.aop.HelloService.sayHello(..))")
	public void logAfter(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		System.out.println("logAfter()==> " + name + " .... [args: " + joinPoint.getArgs() + "]");
	}

	@AfterThrowing("execution(* com.pyhita.aop.HelloService.sayHello(..))")
	public void logThrowing(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		System.out.println("logThrowing()==> " + name + " .... [args: " + joinPoint.getArgs() + "]");
	}

	@Around("execution(* com.pyhita.aop.HelloService.sayHello(..))")
	public void logAround(ProceedingJoinPoint joinPoint) {

        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

}
