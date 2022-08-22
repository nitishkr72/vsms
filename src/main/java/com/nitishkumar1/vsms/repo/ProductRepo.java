package com.nitishkumar1.vsms.repo;

import com.nitishkumar1.vsms.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    void deleteProductById(int id);

    Product findProductById(int id);

    @Query("select p from Product p inner join p.productSoldList productSoldList where productSoldList.employee.id = :id")
    List<Product> findProductSoldsByEmpId(int id);

    @Query("select p from Product p inner join p.productSoldList productSoldList where productSoldList.zone.id = :id")
    List<Product> findProductSoldsByZoneId(int id);

}
