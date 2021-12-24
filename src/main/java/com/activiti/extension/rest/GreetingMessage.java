package com.activiti.extension.rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "greeting")
public class GreetingMessage implements Serializable {

    String name;
    String text;

    public GreetingMessage() {
    }

    public GreetingMessage(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }
    @XmlElement(name = "text")
    public String getText() {
        return text;
    }

}