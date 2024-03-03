package com.pyhita.web;

import com.pyhita.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;

	@RequestMapping("/hello")
	public String hello() {
		System.out.println("xxxxxx");
		return helloService.hello();
	}
}
