package com.thiago.rodrigues.facimp.projetoFinal_grud.repositories;

import com.thiago.rodrigues.facimp.projetoFinal_grud.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
