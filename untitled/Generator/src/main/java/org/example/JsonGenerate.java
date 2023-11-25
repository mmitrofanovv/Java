package org.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonGenerate {
    private Product product;
    private Warehouse warehouse;

    private Worker worker;

    private String name;

    @JsonCreator
    public JsonGenerate(@JsonProperty String name, @JsonProperty("product") Product product, @JsonProperty("warehouse") Warehouse warehouse,
                        @JsonProperty("worker") Worker worker) {
        this.name = name;
        this.product = product;
        this.warehouse = warehouse;
        this.worker = worker;
    }

    public name getName(){ return name };
    public Product getProduct() {
        return product;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public Worker getWorker() {
        return worker;
    }


    @Override
    public String toString() {
        return "JsonGenerate{" +
                "product=" + product +
                ", warehouse=" + warehouse +
                ", worker=" + worker +
                '}';
    }


}

