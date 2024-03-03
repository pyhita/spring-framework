package com.pyhita.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: kante_yang
 * @Date: 2024/2/26
 */
@EnableAspectJAutoProxy
@ComponentScan("com.pyhita.aop")
@Configuration
public class AopOpenConfig {

}
