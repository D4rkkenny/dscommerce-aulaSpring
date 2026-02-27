package com.devsuperior.dscommerce.repositories;

import com.devsuperior.dscommerce.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
