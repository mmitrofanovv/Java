package org.example;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world!");


    }
/*
List<JsonGenerate> combinedModels = GenerateCombinedModels.generateCombinedModels();

JSONSerializer serializer = new JSONSerializer();
String json = serializer.serialize(combinedModels);

// Вывод JSON
System.out.println(json);
//////////////////
String json = "{...}"; // JSON строка

JSONDeserializer deserializer = new JSONDeserializer();
List<JsonGenerate> combinedModels2 = deserializer.deserialize(json);


for (String element : arrayList) {
System.out.println(element);
}
System.out.println(Arrays.toString(list.toArray()));
list.forEach(System.out::println);
*/
    }