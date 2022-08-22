package com.nitishkumar1.vsms.controller;

import com.nitishkumar1.vsms.model.ProductType;
import com.nitishkumar1.vsms.service.ProductTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product-type")
public class ProductTypeController {
    private final ProductTypeService productTypeService;

    public ProductTypeController(ProductTypeService productTypeService) {
        this.productTypeService = productTypeService;
    }

    @PostMapping("/add")
    public ResponseEntity<ProductType> addProductType(@RequestBody ProductType productType) {
        ProductType newProductType = productTypeService.addProductType(productType);
        return new ResponseEntity<>(newProductType, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<ProductType>> getAllProductType() {
        List<ProductType> productTypes = productTypeService.getAllProductType();
        return new ResponseEntity<>(productTypes, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProductType(@PathVariable("id") int id) {
        productTypeService.deleteProductType(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
