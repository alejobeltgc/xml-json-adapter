package org.acme.adapter.infrastructure.adapters.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.acme.adapter.domain.JsonModel;
import org.acme.adapter.domain.XmlModel;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class JsonFormatterAdapter {

    public String format(XmlModel xmlModel) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonModel jsonModel = new JsonModel(xmlModel.getMessage());
            return objectMapper.writeValueAsString(jsonModel);
        } catch (Exception e) {
            throw new RuntimeException("Error converting to JSON", e);
        }
    }
}
