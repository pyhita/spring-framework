package com.pyhita;

import com.pyhita.bean.Dog;
import com.pyhita.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans.xml");
		Person person = ctx.getBean(Person.class);
		Dog dog = ctx.getBean(Dog.class);
		System.out.println(dog.getName());
		System.out.println(person.getName());
	}
}
