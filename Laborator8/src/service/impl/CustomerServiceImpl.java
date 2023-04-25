package service.impl;

import exceptions.StoreNotFoundException;
import model.Customer;
import model.Product;
import model.Store;
import service.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static constants.Constants.STORE_NOT_FOUND;

public class CustomerServiceImpl implements CustomerService {


    private Customer customer;

    public CustomerServiceImpl(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String getShoppingCartByStore(Store store) {
        try {
            if (!this.customer.getShoppingCart().containsKey(store))
                throw new StoreNotFoundException(String.format(STORE_NOT_FOUND, store.getStoreName()));
        } catch (StoreNotFoundException exception) {
            return exception.getMessage();
        }
        return store.getStoreName() + ": " + customer.getShoppingCart().get(store);
    }

    @Override
    public List<String> getAllProducts() {
        List<String> products = new ArrayList<>();
        for(Store store : customer.getShoppingCart().keySet()){
            this.customer.getShoppingCart().get(store).stream().sorted().distinct().forEach(p -> products.add(p.toString()));
        }
        return products;
    }

    public List<List<Product>> getFlatMapProducts(){
        List<List<Product>> allProducts = new ArrayList<>();
        customer.getShoppingCart().keySet().forEach(p -> allProducts.add(customer.getShoppingCart().get(p)));
        return allProducts;
    }

    @Override
    public Optional<Product> getMaxPriceProduct() {
        return getFlatMapProducts().stream()
                .flatMap(products -> products.stream())
                .max(Product::compareTo);
    }

    @Override
    public Optional<Product> getMinPriceProduct() {
        return getFlatMapProducts().stream()
                .flatMap(products -> products.stream())
                .min(Product::compareTo);
    }
}
