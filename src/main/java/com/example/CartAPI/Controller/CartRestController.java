package com.example.CartAPI.Controller;

import com.example.CartAPI.Cart.CartServices;
import com.example.CartAPI.Cart.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CartRestController {
@Autowired
CartServices services;
    @GetMapping("/products")
    public List<Product> get(){
        return services.getProducts();
    }

    @PostMapping("/products")
    public void add(@RequestBody Product product) {
        services.addProducts(product);
    }

    @DeleteMapping("/products/{productId}")
    public void remove(@PathVariable int productId){
        services.deleteProduct(productId);
    }



}
