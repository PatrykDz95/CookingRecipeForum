package com.cooking.recepie.website.cookingwebsite.controller;

import com.cooking.recepie.website.cookingwebsite.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;

@Controller
public class MessageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageController.class);

    @MessageMapping("/send")
    @SendTo("/topic/messages")
    public Message send(Message message) {

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info(String.format("Received message [%s] on `/app/chat` message mapping!", message.toString()));
        }

        LocalDateTime timestamp = LocalDateTime.now();
        return new Message(message.getFrom(), message.getMessage(), timestamp);
    }
}

