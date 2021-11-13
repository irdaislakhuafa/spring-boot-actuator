package com.example.springbootactuator.monitors;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class OtherMonitorService implements HealthIndicator{

    private Boolean otherServiceStatus = true;

    @Override
    public Health health() {
        // TODO Auto-generated method stub
        return isOtherServiceStatusGood() ? Health.up().withDetail("OtherServiceStatus", "Running").build() : Health.down().withDetail("OtherServiceStatus", "Not Running").build();
    }

    private Boolean isOtherServiceStatusGood(){
        // your logic here
        return otherServiceStatus = !otherServiceStatus;
    }
    
}
