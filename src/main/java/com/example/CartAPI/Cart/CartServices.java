package com.example.CartAPI.Cart;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class CartServices implements Services {
    List<Product> products = new ArrayList<>();

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public void addProducts(Product product) {
        products.add(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(id)) {
                products.remove(i);
                break;
            }
        }
    }
}
