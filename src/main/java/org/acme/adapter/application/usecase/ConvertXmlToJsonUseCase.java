package org.acme.adapter.application.usecase;


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
        return xmlToJsonService.convertToJson(xmlToJsonService.parseXml(xmlData));
    }
}
