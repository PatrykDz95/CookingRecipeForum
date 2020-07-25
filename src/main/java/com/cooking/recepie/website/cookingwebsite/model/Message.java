package com.cooking.recepie.website.cookingwebsite.model;

import java.time.LocalDateTime;

public class Message {

    private String from;
    private String message;
    private LocalDateTime timeStamp;

    public Message() {
        // required for Jackson
    }

    public Message(String from, String message, LocalDateTime timeStamp) {
        this.from = from;
        this.message = message;
        this.timeStamp = timeStamp;
    }


    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String text) {
        this.message = text;
    }
}
