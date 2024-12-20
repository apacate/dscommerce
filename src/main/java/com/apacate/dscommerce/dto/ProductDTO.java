package com.apacate.dscommerce.dto;

import com.apacate.dscommerce.entities.Product;
import jakarta.validation.constraints.*;


public class ProductDTO {

    private Long id;

    @Size(min = 3, max = 80, message = "O tamanho deve estar entre 3 e 80 caracteres")
    @NotBlank(message = "Campo requerido")
    private String name;

    @Size(min = 10, message = "A descricao deve ter no minimo 10 caracteres")
    @NotBlank(message = "Campo requerido")
    private String description;

    @PositiveOrZero(message = "O valor deve ser maior ou igual a zero")
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
