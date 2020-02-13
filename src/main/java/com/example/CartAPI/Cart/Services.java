package com.example.CartAPI.Cart;

import com.example.CartAPI.Cart.Product;

import java.util.List;

public interface Services {
    List<Product> getProducts();
    void addProducts(Product obj);
    void deleteProduct(Integer id);
}
