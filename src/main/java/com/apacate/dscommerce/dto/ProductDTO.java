package com.apacate.dscommerce.dto;

import com.apacate.dscommerce.entities.Product;
import jakarta.persistence.Column;

public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imagUrl;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, String description, Double price, String imagUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imagUrl = imagUrl;
    }


    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imagUrl = entity.getImagUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImagUrl() {
        return imagUrl;
    }
}
