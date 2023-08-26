package com.interview.interviewassessment.controller;

import com.interview.interviewassessment.model.Product;
import com.interview.interviewassessment.repository.IProductRepo;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final IProductRepo productRepo;

    public ProductController(IProductRepo productRepo) {
        this.productRepo = productRepo;
    }


    @RequestMapping(value = "get-all-products", method = RequestMethod.GET)
    public ResponseEntity getAllProducts () {
        return ResponseEntity.ok(this.productRepo.findAll());

    }



    @RequestMapping(value = "get-filtered-products", method = RequestMethod.POST)

    public List<Product> getFilterBy(@RequestBody String productType) {
        System.out.println(productType);
            return productRepo.findByProductType(productType);
    }



}
