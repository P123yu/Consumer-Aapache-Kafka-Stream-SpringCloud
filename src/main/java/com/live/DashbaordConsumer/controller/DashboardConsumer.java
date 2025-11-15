package com.live.DashbaordConsumer.controller;

import com.live.DashbaordConsumer.model.Dashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;



@Configuration
public class DashboardConsumer {

    @Bean
    public Consumer<Dashboard> dashboardConsumerFunction() {
        return p -> System.out.println("Consumed: " + p.getName() + " from " + p.getDesign());
    }
}
