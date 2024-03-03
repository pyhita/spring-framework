package com.pyhita;

import com.pyhita.config.AppConfig;
import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration.Dynamic;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.Set;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */

/**
 *  只要Tomcat 启动就会帮我们加载这个类：
 *  * 创建容器，指定了配置类(所有ioc aop 等spring的功能没有问题了)
 *  * 注册一个servlet，DispatchServlet
 *  * 以后所有的web请求 都交个DispatchServlet 处理
 */
public class AppStarter implements ServletContainerInitializer {

	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
		// 注解方式 mvc 创建IoC container
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(AppConfig.class);

		// 创建DispatchServlet
		DispatcherServlet servlet = new DispatcherServlet(context);
		Dynamic registration = ctx.addServlet("app", servlet);
		registration.setLoadOnStartup(1);
		registration.addMapping("/");
	}
}
