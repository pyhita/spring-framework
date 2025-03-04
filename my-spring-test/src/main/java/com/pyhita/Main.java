package com.pyhita;

import com.pyhita.bean.Person;
import com.pyhita.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/2/19
 */
public class Main {

    public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans2.xml");
		Person person = ctx.getBean(Person.class);
	}
}