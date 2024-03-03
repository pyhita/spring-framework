package com.pyhita;

import com.pyhita.bean.Dog;
import com.pyhita.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans.xml");
		Person person = ctx.getBean(Person.class);
<<<<<<< HEAD
		Dog dog = ctx.getBean(Dog.class);
		System.out.println(dog.getName());
=======
		System.out.println(person.getName());
>>>>>>> a1d6bc0fe05efee69cbe485dd95283e9a5c37a45
	}
}
