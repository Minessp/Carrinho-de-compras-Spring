package br.com.msp.carrinho_de_compras_spring.repository;

import br.com.msp.carrinho_de_compras_spring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
