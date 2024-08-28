package com.example.bookstore.metrics;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomMetrics {

    private final MeterRegistry meterRegistry;

    @Autowired
    public CustomMetrics(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
        createCustomMetrics();
    }

    private void createCustomMetrics() {
        // Create a custom counter metric
        meterRegistry.counter("custom_metric_counter", "type", "custom");
        
        // Example of creating other types of metrics
        meterRegistry.gauge("custom_metric_gauge", 1.0);
        meterRegistry.timer("custom_metric_timer");
    }
}
