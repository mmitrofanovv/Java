package org.example;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        List<JsonGenerate> generator = GenerateCombinedModels.generateCombinedModels(100);
        for (org.example.JsonGenerate JsonGenerate : generator) {
            System.out.println(JsonGenerate);
        }

//        String json = "D:\\Projects\\Java\\VSU Projects\\untitled\\file.json";
//        Desirialization desirialization = new Desirialization();
//        List<JsonGenerate> models = desirialization.deserialize(json);
//        for (JsonGenerate JsonGenerate : models){
//            System.out.println(JsonGenerate);
//        }

        Serialization serializer = new Serialization();
        serializer.serialize(generator);
        System.out.println("-----------------------------");
        System.out.println(generator);
//        ObjectMapper objectMapper = new ObjectMapper();
//        JsonGenerate generator2 = objectMapper.readValue(new File("file.json"), JsonGenerate.class);
//        System.out.println(generator2);
//        System.out.println("-----------------------------");
//        Desirialization desirialization = new Desirialization();
//        List<JsonGenerate> generator2 = desirialization.deserialize("file.json");
////        // List<JsonGenerate> generator2 = desirialization.deserialize(json);
////        System.out.println("---------------------");
//        for (JsonGenerate JsonGenerate : generator2) {
//            System.out.println(JsonGenerate);
//        }
    }
}
