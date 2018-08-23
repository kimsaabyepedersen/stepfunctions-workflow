package org.saabye_pedersen.functions;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Handler for requests to Lambda function.
 */
public class AssignCaseHandler implements RequestStreamHandler {

    public void handleRequest(final InputStream inputStream, final OutputStream outputStream, final Context context) {
        AssignCaseInput assignCaseInput = JacksonHelper.getInputFromStream(inputStream, AssignCaseInput.class);

        Output output = new Output(assignCaseInput.getCaseId(), assignCaseInput.getMessage() + "assigned...");

        JacksonHelper.writeOutput(output, outputStream);
    }
}
