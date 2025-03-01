package br.com.msp.carrinho_de_compras_spring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;

@ControllerAdvice
public class ProductAdviceController {

    @ExceptionHandler(value = NullPointerException.class)
        public ResponseEntity<Object> handleNullFieldsException() {
        HashMap<String, String> body = new HashMap<>();
        body.put("Erro", "Preencha todos os campos!");

        return ResponseEntity.badRequest().body(body);
    }
}
