package com.nitishkumar1.vsms.service;

import com.nitishkumar1.vsms.model.ProductSold;
import com.nitishkumar1.vsms.repo.ProductSoldRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductSoldService {
    private final ProductSoldRepo productSoldRepo;

    public ProductSoldService(ProductSoldRepo productSoldRepo) {
        this.productSoldRepo = productSoldRepo;
    }

    public List<ProductSold> findAllProductSold() {
        return productSoldRepo.findAll();
    }

    public ProductSold addProductSold(ProductSold productSold) {
        return productSoldRepo.save(productSold);
    }

    public void deleteProductSoldById(int id) {
        productSoldRepo.deleteProductSoldById(id);
    }
}
