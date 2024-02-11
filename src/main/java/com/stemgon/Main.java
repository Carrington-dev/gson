package com.stemgon;

import com.google.gson.Gson;
import com.stemgon.models.Product;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        Product product = new Product(1, "New iPhone For Sale", 23.45, new Date());
        Product product2 = new Product(2, "New iPhone For Sale", 23.45, new Date());
        Gson gson = new Gson();
        var jsonSerializer = gson.toJson(product);
        System.out.println(product);
        System.out.println(jsonSerializer);
        var jsonDesSerializer = gson.fromJson(jsonSerializer, Product.class);
        System.out.println(jsonDesSerializer);
        var newJson = gson.toJson(jsonDesSerializer);
        System.out.println(newJson);


    }
}
