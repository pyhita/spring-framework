package com.pyhita.config;

import com.pyhita.bean.Person;
import com.pyhita.factorybean.HelloFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: kante_yang
 * @Date: 2024/2/19
 */
@Configuration
public class MainConfig {

	@Bean
	public Person person() {
		Person person = new Person();
		person.setName("kante");
		person.setAge(22);

		return person;
	}

	@Bean
	public HelloFactory helloFactory() {
		return new HelloFactory();
	}
}
