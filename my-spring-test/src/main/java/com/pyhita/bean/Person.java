package com.pyhita.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationStartupAware;
import org.springframework.core.metrics.ApplicationStartup;

/**
 * @Author: kante_yang
 * @Date: 2024/2/19
 */
public class Person implements ApplicationContextAware, InitializingBean {

	@Value("${JAVA_HOME}")
	private String name;
	private Integer age;

	public Person() {
		System.out.println("Person ....");
	}

	private ApplicationStartup applicationStartup;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Person# setName ....");
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Person# setApplicationContext .... ");
	}

	@Override
	public void afterPropertiesSet() throws Exception {

	}
}
