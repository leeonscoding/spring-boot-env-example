package com.leeonscoding.envexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
public class DefaultEnvClassTest {
    @Autowired
    private Environment environment;

    @Test
    public void test() {
        Assertions.assertEquals("C:\\Program Files\\Java\\jdk-17.0.5", environment.getProperty("JAVA_HOME"));
    }
}
