package com.nitishkumar1.vsms.service;

import com.nitishkumar1.vsms.model.Product;
import com.nitishkumar1.vsms.model.ProductSold;
import com.nitishkumar1.vsms.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {
    private final ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> findAllProduct() {
        return productRepo.findAll();
    }

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    public void deleteProductById(int id) {
        productRepo.deleteProductById(id);
    }

    public Product findProductById(int id) {
        return productRepo.findProductById(id);
    }


    public List<Product> findProductSoldsByEmpId(int id) {
        return productRepo.findProductSoldsByEmpId(id);
    }

    public List<Product> findProductSoldByZoneId(int id) {
        return productRepo.findProductSoldsByZoneId(id);
    }

}
