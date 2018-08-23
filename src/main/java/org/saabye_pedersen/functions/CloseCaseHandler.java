package org.saabye_pedersen.functions;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Handler for requests to Lambda function.
 */
public class CloseCaseHandler implements RequestStreamHandler {

    public void handleRequest(final InputStream inputStream, final OutputStream outputStream, final Context context) {

        CloseCaseInput closeCaseInput = JacksonHelper.getInputFromStream(inputStream, CloseCaseInput.class);

        Output output = new Output(closeCaseInput.getCaseId(), closeCaseInput.getMessage() + "closed.", closeCaseInput.getStatus());

        JacksonHelper.writeOutput(output, outputStream);
    }
}
