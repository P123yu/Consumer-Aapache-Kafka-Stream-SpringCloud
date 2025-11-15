package com.live.DashbaordConsumer.service;

import com.live.DashbaordConsumer.model.Dashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class WebSocketService {

    @Autowired
    private SimpMessagingTemplate template;

    public void sendToUI(Dashboard dashboard) {
        System.out.println("websocket called");
        template.convertAndSend("/topic/live-dashboard", dashboard);
    }
}
