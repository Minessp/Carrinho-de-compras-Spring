package br.com.msp.carrinho_de_compras_spring.controller;

import br.com.msp.carrinho_de_compras_spring.entity.Product;
import br.com.msp.carrinho_de_compras_spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping(value = "/save")
    public ResponseEntity<Product> save(@RequestBody Product product) {
        productService.save(product);
        return ResponseEntity.ok().body(product);
    }

    @GetMapping(value = "/listall")
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok().body(productService.findAll());
    }
}
