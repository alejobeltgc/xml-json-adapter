package org.acme.adapter.infrastructure.entrypoints;

import org.acme.adapter.application.usecase.ConvertXmlToJsonUseCase;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/convert")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_XML)
public class XmlJsonResource {

    private final ConvertXmlToJsonUseCase convertXmlToJsonUseCase;

    @Inject
    public XmlJsonResource(ConvertXmlToJsonUseCase convertXmlToJsonUseCase) {
        this.convertXmlToJsonUseCase = convertXmlToJsonUseCase;
    }

    @POST
    public Response convert(String xmlData) {
        String json = convertXmlToJsonUseCase.convert(xmlData);
        return Response.ok(json).build();
    }
}
