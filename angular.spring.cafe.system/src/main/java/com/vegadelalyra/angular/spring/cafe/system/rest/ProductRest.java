package com.vegadelalyra.angular.spring.cafe.system.rest;

import com.vegadelalyra.angular.spring.cafe.system.wrapper.ProductWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping(path = "/product")
public interface ProductRest {
    @PostMapping(path = "")
    ResponseEntity<String> addNewProduct(@RequestBody(required = true) Map<String, String> reqeustMap);

    @GetMapping(path = "")
    ResponseEntity<List<ProductWrapper>> getAllProduct();

    @PatchMapping(path = "")
    ResponseEntity<String> updateProduct(@RequestBody(required = true) Map<String, String> requestMap);

    @DeleteMapping(path = "/{id}")
    ResponseEntity<String> deleteProduct(@PathVariable Integer id);

    @PostMapping(path = "/updateStatus")
    ResponseEntity<String> updateStatus(@RequestBody Map<String, String> requestMap);

    @GetMapping(path = "/getByCategory/{id}")
    ResponseEntity<List<ProductWrapper>> getByCategory(@PathVariable Integer id);

    @GetMapping(path = "/getById/{id}")
    ResponseEntity<ProductWrapper> getProductById(@PathVariable Integer id);
}
