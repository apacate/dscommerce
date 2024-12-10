package com.apacate.dscommerce.controllers;

import com.apacate.dscommerce.dto.ProductDTO;
import com.apacate.dscommerce.entities.Product;
import com.apacate.dscommerce.repositories.ProductRepository;
import com.apacate.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value="/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value="/{id}")
    public ProductDTO findById(@PathVariable Long id){
ProductDTO dto = service.findById(id);
        return dto;
    }

}
