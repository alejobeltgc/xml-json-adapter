package org.acme.adapter.domain;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "data")
public class XmlModel {
    @XmlElement(name = "message")
    private String message;

    public XmlModel() {}

    public XmlModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
