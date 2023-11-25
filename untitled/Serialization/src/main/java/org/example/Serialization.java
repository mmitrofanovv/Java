package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Serialization {
    public void serialize(List<JsonGenerate> JsonGenerate) throws IOException {
        var objectMapper = new ObjectMapper().writerWithDefaultPrettyPrinter();
        objectMapper.writeValue(new File("file.json"), JsonGenerate);
    }
}






