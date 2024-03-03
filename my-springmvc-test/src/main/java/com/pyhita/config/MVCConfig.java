package com.pyhita.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
@Configuration
@ComponentScan("com.pyhita.web")
@EnableWebMvc
public class MVCConfig {

}
