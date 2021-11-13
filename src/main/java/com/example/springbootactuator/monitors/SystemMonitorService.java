package com.example.springbootactuator.monitors;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class SystemMonitorService implements HealthIndicator {

    @Override
    public Health health() {
        // TODO Auto-generated method stub
        return isSystemHealthGood() ? Health.up().withDetails(getSystemProperties()).build() : Health.down().withDetails(getSystemProperties()).build();
    }

    private Boolean isSystemHealthGood(){
        return true;
    }

    private Map<String, String> getSystemProperties(){
        Map<String, String> properties = new HashMap<>();
        properties.put("OS", System.getProperty("os.name"));
        properties.put("JavaVersion", System.getProperty("java.vm.version"));
        properties.put("Arch", System.getProperty("sun.arch.data.model"));
        return properties;
    }
}
