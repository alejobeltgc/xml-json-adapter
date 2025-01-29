package org.acme.adapter.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonModel {
    @JsonProperty("message")
    private String message;

    public JsonModel() {}

    public JsonModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
