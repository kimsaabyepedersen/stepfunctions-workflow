package org.saabye_pedersen.functions;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Handler for requests to Lambda function.
 */
public class EscalateCaseHandler implements RequestStreamHandler {

    public void handleRequest(final InputStream inputStream, final OutputStream outputStream, final Context context) {
        EscalateCaseInput escalateCaseInput = JacksonHelper.getInputFromStream(inputStream, EscalateCaseInput.class);
        Output output = new Output(escalateCaseInput.getCaseId(), escalateCaseInput.getMessage() + "escalating.", escalateCaseInput.getStatus());
        JacksonHelper.writeOutput(output, outputStream);
    }

}
