package main;

import model.Customer;
import model.Product;
import model.Store;
import service.impl.CustomerServiceImpl;

import static constants.Constants.NO_PRODUCTS;

public class Laborator8Main {

    public static void main(String[] args){

        Store store = new Store("MegaImage", "Bucuresti, Sector1");
        Customer customer = new Customer("Customer1", "Address1");
        Product product = new Product(13.5, "coffee", "1234");
        Product product2 = new Product(50.3, "butter", "7895");
        Product product3 = new Product(10.5, "bread", "7549");
        customer.addProduct(store, product);
        customer.addProduct(store, product2);
        customer.addProduct(store, product3);
        customer.addProduct(store, product3);
        customer.addProduct(store, product3);

        CustomerServiceImpl customerService = new CustomerServiceImpl(customer);

        System.out.println(customerService.getShoppingCartByStore(store));
        System.out.println(customerService.getAllProducts());

        System.out.println(customerService.getMaxPriceProduct().isPresent() ? customerService.getMaxPriceProduct().get() : String.format(NO_PRODUCTS, customerService.getCustomer().getName()));
        System.out.println(customerService.getMinPriceProduct().isPresent() ? customerService.getMinPriceProduct().get() : String.format(NO_PRODUCTS, customerService.getCustomer().getName()));
    }

}
