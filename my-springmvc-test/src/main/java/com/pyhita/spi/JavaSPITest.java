package com.pyhita.spi;

import org.junit.jupiter.api.Test;

import java.util.ServiceLoader;

public class JavaSPITest {

    @Test
    public void sayHello() throws Exception {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class); // 加载接口实现类
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello); // 进行调用
    }
}