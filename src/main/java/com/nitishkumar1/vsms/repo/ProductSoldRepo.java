package com.nitishkumar1.vsms.repo;

import com.nitishkumar1.vsms.model.ProductSold;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductSoldRepo extends JpaRepository<ProductSold, Integer> {
    void deleteProductSoldById(int id);
}
