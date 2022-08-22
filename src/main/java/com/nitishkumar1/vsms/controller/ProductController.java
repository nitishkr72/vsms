package com.nitishkumar1.vsms.controller;

import com.nitishkumar1.vsms.model.Product;
import com.nitishkumar1.vsms.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.findAllProduct();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product newProduct = productService.addProduct(product);
        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProductById(@PathVariable("id") int id) {
        productService.deleteProductById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/products/emp/{id}")
    public ResponseEntity<List<Product>> getProductSoldListByEmpId(@PathVariable("id") int id) {
        List<Product> products = productService.findProductSoldsByEmpId(id);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/products/zone/{id}")
    public ResponseEntity<List<Product>> getProductSoldsByZoneId(@PathVariable("id") int id) {
        List<Product> products = productService.findProductSoldByZoneId(id);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }


}
