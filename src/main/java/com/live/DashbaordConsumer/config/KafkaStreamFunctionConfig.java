package com.live.DashbaordConsumer.config;

import com.live.DashbaordConsumer.model.Dashboard;
import com.live.DashbaordConsumer.service.WebSocketService;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;


@Configuration
public class KafkaStreamFunctionConfig {

    @Autowired
    private WebSocketService websocketService;

    @Bean
    public Function<KStream<String, Dashboard>, KStream<String, Dashboard>> processDashboardMessageFunction() {
        return input -> input
                .filter((key, dashBoard) -> "new".equalsIgnoreCase(dashBoard.getDesign()))
                .mapValues(dashBoard -> {
                    dashBoard.setName(dashBoard.getName().toUpperCase());
                    websocketService.sendToUI(dashBoard);
                    return dashBoard;
                });
    }
}



