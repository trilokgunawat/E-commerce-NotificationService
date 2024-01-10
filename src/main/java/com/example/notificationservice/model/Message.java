package com.example.notificationservice.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Message implements Serializable {
    private String message;
    private String source;

    @Override
    public String toString(){
        return "SystemMessage{" + "source = " + source + " message = "+ message + " }";
    }

}
