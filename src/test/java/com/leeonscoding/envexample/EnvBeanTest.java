package com.leeonscoding.envexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EnvBeanTest {

    @Autowired
    private EnvBean bean;

    @Test
    public void directEnvTest() {
        Assertions.assertEquals("C:\\Program Files\\Java\\jdk-17.0.5", bean.getEnvDirect());
    }

    @Test
    public void viaPropertiesEnvTest() {
        Assertions.assertEquals("C:\\Program Files\\Java\\jdk-17.0.5", bean.getEnvViaProperties());
    }
}
