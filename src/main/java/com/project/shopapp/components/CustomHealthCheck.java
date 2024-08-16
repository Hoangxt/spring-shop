package com.project.shopapp.components;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthCheck implements HealthIndicator {
    /*
    @Autowired
    private KafkaAdmin kafkaAdmin;
     */
    @Override
    public Health health() {
        // Implement your custom health check logic here
        try {
            /*
                Map<String, Object> details = new HashMap<>();
            //DOWN => 503
            //Healthcheck for Kafka
            String clusterId = kafkaAdmin.clusterId();
            if (clusterId.isEmpty()) {
                return Health.down()
                        .withDetail("Error", "Cannot get cluster's id").build();
            } else {
                details.put("kafka", String.format("Cluster's id: %s", clusterId));
            }
            String computerName = InetAddress.getLocalHost().getHostName();
            details.put("computerName", String.format("computerName: %s", computerName));
            return Health.up().withDetails(details).build();
            */
            String computerName = java.net.InetAddress.getLocalHost().getHostName();
            return Health.up().withDetail("computerName", computerName).build();
        } catch (Exception e) {
            //throw new RuntimeException(e);
            return Health.down().withDetail("Error", e.getMessage()).build();
        }
    }
}
