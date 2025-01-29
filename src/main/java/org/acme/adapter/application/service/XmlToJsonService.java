package org.acme.adapter.application.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.acme.adapter.domain.JsonModel;
import org.acme.adapter.domain.XmlModel;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class XmlToJsonService {

    public XmlModel parseXml(String xmlData) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            return xmlMapper.readValue(xmlData, XmlModel.class);
        } catch (Exception e) {
            throw new RuntimeException("Error parsing XML", e);
        }
    }

    public String convertToJson(XmlModel xmlModel) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonModel jsonModel = new JsonModel(xmlModel.getMessage());
            return objectMapper.writeValueAsString(jsonModel);
        } catch (Exception e) {
            throw new RuntimeException("Error converting to JSON", e);
        }
    }
}
