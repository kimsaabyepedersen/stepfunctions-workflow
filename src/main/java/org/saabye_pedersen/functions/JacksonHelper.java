package org.saabye_pedersen.functions;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class JacksonHelper {

    private static ObjectMapper MAPPER = new ObjectMapper();

    static <T> T getInputFromStream(InputStream inputStream, Class<T> clazz) {
        try {
            return MAPPER.readValue(inputStream, clazz);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void writeOutput(Output output, OutputStream outputStream) {
        try {
            MAPPER.writeValue(outputStream, output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
