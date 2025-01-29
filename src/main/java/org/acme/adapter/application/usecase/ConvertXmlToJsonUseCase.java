package org.acme.adapter.application.usecase;

import org.acme.adapter.domain.JsonModel;
import org.acme.adapter.domain.XmlModel;
import org.acme.adapter.application.service.XmlToJsonService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ConvertXmlToJsonUseCase {

    private final XmlToJsonService xmlToJsonService;

    @Inject
    public ConvertXmlToJsonUseCase(XmlToJsonService xmlToJsonService) {
        this.xmlToJsonService = xmlToJsonService;
    }

    public String convert(String xmlData) {
        XmlModel xmlModel = xmlToJsonService.parseXml(xmlData);
        return xmlToJsonService.convertToJson(xmlModel);
    }
}
