package org.acme.adapter.infrastructure.handlers;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Provider
public class XmlParsingExceptionHandler implements ExceptionMapper<XmlParsingException> {

    private static final Logger logger = LoggerFactory.getLogger(XmlParsingExceptionHandler.class);

    @Override
    public Response toResponse(XmlParsingException exception) {
        logger.error("Error processing request: {}", exception.getMessage(), exception);

        ErrorResponse errorResponse = new ErrorResponse(
                "XML_PARSE_ERROR",
                "Error parsing the XML data: " + exception.getMessage()
        );

        return Response.status(Response.Status.BAD_REQUEST)
                .entity(errorResponse)
                .build();
    }
}
