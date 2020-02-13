package com.example.CartAPI.Cart;

public class Product {
    private String name;
    private String colour;
    private Integer size;
    private Integer id;

    public Product(String name, String colour, Integer size) {
        this.name = name;
        this.colour = colour;
        this.size = size;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
