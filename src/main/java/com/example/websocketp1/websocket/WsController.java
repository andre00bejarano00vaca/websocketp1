package com.example.websocketp1.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WsController {
    @MessageMapping("/chat1")
    @SendTo("/topic/canal1")
    public Information getMessage(Message message){
        System.out.println("El mensaje recibidoo es: "+message);
        return new Information(message.body());
    }
}
