package org.saabye_pedersen.functions;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Handler for requests to Lambda function.
 */
public class OpenCaseHandler implements RequestStreamHandler {

    public void handleRequest(final InputStream inputStream, final OutputStream outputStream, final Context context) {
        OpenCaseInput openCaseInput = JacksonHelper.getInputFromStream(inputStream, OpenCaseInput.class);
        Output output = new Output(openCaseInput.getInputCaseID(), "Case " + openCaseInput.getInputCaseID() + ": opened...");
        JacksonHelper.writeOutput(output, outputStream);
    }
}
