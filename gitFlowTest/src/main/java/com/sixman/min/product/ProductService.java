package com.sixman.min.product;

public class ProductService {
    public String brand;

    public ProductService(String brand) {
        this.brand = brand;
        System.out.println(brand+" 값은 "+Product.price);
    }
}
