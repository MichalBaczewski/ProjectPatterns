package com.baczewski.patterns.structural.proxy;

import java.util.List;

public interface Basket {

    void addProduct(Product product);
    void removeProduct(Product product);
    List<Product> getProducts();

}
