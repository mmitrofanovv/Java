package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class GenerateCombinedModels {
    public static List<JsonGenerate> generateCombinedModels(int numberOfValues) {
        List<Object> allModels = new ArrayList<>();
        List<JsonGenerate> combinedModels = new ArrayList<>();
        Random random = new Random();


        for (int i = 0; i < numberOfValues; i++) {


            String productName = "Product" + i;
            double productPrice = 10.0 + random.nextDouble() * 100.0;
            int productId = random.nextInt();
            Product product = new Product(productName, productPrice, productId);

            String warehouseName = "Warehouse" + i;
            String warehouseAddress = "Address" + i;
            int warehouseNumber = random.nextInt();
            Warehouse warehouse = new Warehouse(warehouseName, warehouseAddress, warehouseNumber);

            String workerName = "Worker" + i;
            String workerPost = "Post" + i;
            int workerId = random.nextInt();
            Worker worker = new Worker(workerName, workerPost, workerId);

            String name = "Model" + i;
            JsonGenerate combinedModel = new JsonGenerate(name, product, warehouse, worker);
            combinedModels.add(combinedModel);
        }

        return combinedModels;
    }
}
