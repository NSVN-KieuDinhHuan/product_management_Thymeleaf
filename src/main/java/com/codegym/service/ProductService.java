
package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static final Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1,"Samsung Galaxy a53",9000000,"new","https://cdn.tgdd.vn/Products/Images/42/246196/Samsung-Galaxy-A53-den-thumb-1-600x600.jpg"));
        products.put(2, new Product(2,"Iphone1 11 ",9000000,"new","https://cdn.tgdd.vn/Products/Images/42/153856/iphone-xi-do-600x600.jpg"));
        products.put(3, new Product(3,"Oppo Reno 6",9000000,"new","https://cdn.tgdd.vn/Products/Images/42/239747/oppo-reno6-z-5g-aurora-1-600x600.jpg"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);

    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}