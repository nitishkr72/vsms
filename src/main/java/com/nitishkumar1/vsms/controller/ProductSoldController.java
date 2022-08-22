package com.nitishkumar1.vsms.controller;

import com.nitishkumar1.vsms.model.ProductSold;
import com.nitishkumar1.vsms.service.ProductSoldService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product-sold")
public class ProductSoldController {
    private final ProductSoldService productSoldService;

    public ProductSoldController(ProductSoldService productSoldService) {
        this.productSoldService = productSoldService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<ProductSold>> getAllZones() {
        List<ProductSold> productSolds = productSoldService.findAllProductSold();
        return new ResponseEntity<>(productSolds, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ProductSold> addProductSold(@RequestBody ProductSold productSold) {
        ProductSold productSold1 = productSoldService.addProductSold(productSold);
        return new ResponseEntity<>(productSold1, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProductSoldById(@PathVariable("id") int id) {
        productSoldService.deleteProductSoldById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
