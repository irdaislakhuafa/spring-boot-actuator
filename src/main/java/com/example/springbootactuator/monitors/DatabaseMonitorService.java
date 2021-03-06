package com.example.springbootactuator.monitors;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component 
public class DatabaseMonitorService implements HealthIndicator {

    @Override
    public Health health() {
        // TODO Auto-generated method stub
        return isDatabaseFine() ? Health.up().withDetail("DatabaseStatus", "Running").build() : Health.down().withDetail("DatabaseStatus", "Not Running").build();
    }

    private Boolean isDatabaseFine(){
        // logic to check db status
        return true;
    }
    
}
