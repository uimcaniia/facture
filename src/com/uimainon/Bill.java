package com.uimainon;

import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<Product, Integer> products;


    public void addProduct(Product products, Integer quantity){

        this.products.put(products, quantity);
    }

    public Customer getCustomer() {

        return customer;
    }

    public Map<Product, Integer> getProducts() {

        return products;
    }
}
