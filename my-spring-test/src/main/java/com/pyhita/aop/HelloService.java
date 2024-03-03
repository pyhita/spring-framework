package com.pyhita.aop;

import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/2/27
 */
@Component
public class HelloService {

	public void sayHello() {
		System.out.println("Hello ....");
	}

}
