package org.saabye_pedersen.functions;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

/**
 * Handler for requests to Lambda function.
 */
public class WorkOnCaseHandler implements RequestStreamHandler {

    public void handleRequest(final InputStream inputStream, final OutputStream outputStream, final Context context) {

        WorkOnCaseInput workOnCaseInput = JacksonHelper.getInputFromStream(inputStream, WorkOnCaseInput.class);

        final int status = new Random().nextInt(2);
        String msg = status == 1 ? "resolved..." : "unresolved...";

        Output output = new Output(workOnCaseInput.getCaseId(), workOnCaseInput.getMessage() + msg, status);
        JacksonHelper.writeOutput(output,outputStream);
    }


}
