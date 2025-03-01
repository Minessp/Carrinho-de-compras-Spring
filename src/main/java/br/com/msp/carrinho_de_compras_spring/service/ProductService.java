package br.com.msp.carrinho_de_compras_spring.service;

import br.com.msp.carrinho_de_compras_spring.entity.Product;
import br.com.msp.carrinho_de_compras_spring.exception.NullFieldsException;
import br.com.msp.carrinho_de_compras_spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product) {
        if(product.getNome() == null || product.getPreco() == null)
            throw new NullFieldsException();
        if(product.getQuantidade() == null)
            product.setQuantidade(1);
        return productRepository.save(product);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
