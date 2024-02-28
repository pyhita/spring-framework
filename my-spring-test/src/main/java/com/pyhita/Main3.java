package com.pyhita;

import com.pyhita.aop.HelloService;
import com.pyhita.config.AopOpenConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/2/27
 */
public class Main3 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AopOpenConfig.class);
		HelloService bean = ctx.getBean(HelloService.class);
		bean.sayHello();
	}

}
