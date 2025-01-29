package org.acme.adapter.infrastructure.handlers;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class XmlParsingExceptionHandler implements ExceptionMapper<XmlParsingException> {

    @Override
    public Response toResponse(XmlParsingException exception) {
        // Log del error (opcional)
        exception.printStackTrace();

        // Respuesta personalizada
        ErrorResponse errorResponse = new ErrorResponse(
                "XML_PARSE_ERROR",
                "Error parsing the XML data: " + exception.getMessage()
        );

        return Response.status(Response.Status.BAD_REQUEST)
                .entity(errorResponse)
                .build();
    }
}

