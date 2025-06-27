package com.ecommerce.service;
import com.ecommerce.model.Product;
import java.util.List;
import java.util.Optional;
public interface ProductService {
    Product saveProduct(Product product);
    
    Optional<Product> getProductById(Long id);

    List<Product> getAllProducts();

    void deleteProduct(Long id);
    
}
