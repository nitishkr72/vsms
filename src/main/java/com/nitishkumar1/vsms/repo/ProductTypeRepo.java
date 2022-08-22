package com.nitishkumar1.vsms.repo;

import com.nitishkumar1.vsms.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTypeRepo extends JpaRepository<ProductType, Integer> {
    void deleteProductTypeById(int id);
}
