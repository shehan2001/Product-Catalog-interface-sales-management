package com.interview.interviewassessment.repository;


import com.interview.interviewassessment.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface IProductRepo extends JpaRepository<Product, Long> {

    List<Product> findByProductType(String productType);

}
