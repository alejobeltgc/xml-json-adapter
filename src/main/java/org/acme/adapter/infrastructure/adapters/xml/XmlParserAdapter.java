package org.acme.adapter.infrastructure.adapters.xml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.acme.adapter.domain.XmlModel;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class XmlParserAdapter {

    public XmlModel parse(String xmlData) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            return xmlMapper.readValue(xmlData, XmlModel.class);
        } catch (Exception e) {
            throw new RuntimeException("Error parsing XML", e);
        }
    }
}

