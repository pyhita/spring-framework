package com.pyhita.factorybean;

import com.pyhita.bean.Hello;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: kante_yang
 * @Date: 2024/2/26
 */
public class HelloFactory implements FactoryBean<Hello> {

	@Override
	public Hello getObject() throws Exception {

		return new Hello();
	}

	@Override
	public Class<?> getObjectType() {
		return Hello.class;
	}
}
