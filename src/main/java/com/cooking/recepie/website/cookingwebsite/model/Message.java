package com.cooking.recepie.website.cookingwebsite.model;

import java.time.LocalDateTime;
import java.util.Objects;

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

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "Message{" +
                "from='" + from + '\'' +
                ", message='" + message + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message1 = (Message) o;
        return Objects.equals(getFrom(), message1.getFrom()) &&
                Objects.equals(getMessage(), message1.getMessage()) &&
                Objects.equals(timeStamp, message1.timeStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFrom(), getMessage(), timeStamp);
    }
}
