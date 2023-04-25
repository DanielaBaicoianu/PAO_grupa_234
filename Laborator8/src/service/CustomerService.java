package service;

import model.Product;
import model.Store;

import java.util.List;
import java.util.Optional;

public interface CustomerService {


    String getShoppingCartByStore(Store store);

    List<String> getAllProducts();

    Optional<Product> getMaxPriceProduct();

    Optional<Product> getMinPriceProduct();

}
