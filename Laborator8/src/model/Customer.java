package model;

import exceptions.StoreNotFoundException;

import java.util.*;

import static constants.Constants.STORE_NOT_FOUND;

public class Customer {

    private Map<Store, List<Product>> shoppingCart;

    private String name;

    private String address;

    public Customer(String name, String address) {
        this.shoppingCart = new HashMap<>();
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Map<Store, List<Product>> getShoppingCart() {
        return shoppingCart;
    }

    public void addProduct(Store store, Product product) {
        if (this.shoppingCart.containsKey(store)) {
            List<Product> products = new ArrayList<>(shoppingCart.get(store));
            products.add(product);
            shoppingCart.put(store, products);
        } else {
            shoppingCart.put(store, Arrays.asList(product));
        }
    }

}