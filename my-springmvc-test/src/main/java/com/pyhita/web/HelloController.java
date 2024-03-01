package com.pyhita.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {

		return "Hello Spring Web MVC !";
	}
}
