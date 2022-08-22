package com.nitishkumar1.vsms.service;

import com.nitishkumar1.vsms.model.ProductType;
import com.nitishkumar1.vsms.repo.ProductTypeRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductTypeService {

    private final ProductTypeRepo productTypeRepo;

    public ProductTypeService(ProductTypeRepo productTypeRepo) {
        this.productTypeRepo = productTypeRepo;
    }

    public ProductType addProductType(ProductType productType) {
            return productTypeRepo.save(productType);
    }

    public List<ProductType> getAllProductType() {
        return productTypeRepo.findAll();
    }

    public void deleteProductType(int id) {
        productTypeRepo.deleteProductTypeById(id);
    }
}
