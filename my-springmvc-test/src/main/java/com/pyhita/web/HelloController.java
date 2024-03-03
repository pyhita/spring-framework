package com.pyhita.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {

		return "Hello Spring Web MVC !";
	}
}
