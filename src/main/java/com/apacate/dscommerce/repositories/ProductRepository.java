package com.apacate.dscommerce.repositories;

import com.apacate.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Long> {

}
