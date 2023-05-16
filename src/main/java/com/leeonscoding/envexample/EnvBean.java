package com.leeonscoding.envexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EnvBean {
    @Value("${JAVA_HOME}")
    private String envDirect;

    @Value("${java.home}")
    private String envViaProperties;

    public String getEnvDirect() {
        return envDirect;
    }

    public void setEnvDirect(String envDirect) {
        this.envDirect = envDirect;
    }

    public String getEnvViaProperties() {
        return envViaProperties;
    }

    public void setEnvViaProperties(String envViaProperties) {
        this.envViaProperties = envViaProperties;
    }
}
