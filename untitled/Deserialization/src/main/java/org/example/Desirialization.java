package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Desirialization {

    public List<JsonGenerate> deserialize(String json) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<JsonGenerate> models = new ArrayList<>();
        JsonGenerate generator;
//        generator = objectMapper.readValue(JsonGenerate.class);
//        ObjectMapper objectMapper = new ObjectMapper();
//        List<JsonGenerate> generators = new ArrayList<>();
//
//        try (BufferedReader reader = Files.newBufferedReader(Paths.get(json), StandardCharsets.UTF_8)) {
//            JsonParser parser = objectMapper.getFactory().createParser(reader);
//
//            if (parser.nextToken() == JsonToken.START_ARRAY) {
//                while (parser.nextToken() != JsonToken.END_ARRAY) {
//// Десериализуем каждый объект клиента
//                    JsonGenerate generator = objectMapper.readValue(parser, JsonGenerate.class);
//                    generators.add(generator);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return generators;



//        ObjectMapper objectMapper = new ObjectMapper();
//        return objectMapper.readValue(new File(json), new TypeReference<List<JsonGenerate>>() {
//        });
        return null;
    }


}
