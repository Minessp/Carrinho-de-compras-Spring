# Carrinho de compras com Spring Boot
Uma API REST que adiciona produtos baseado em nome, preço e quantidade.

```java
@Entity
@Table(name = "produto")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Double preco;

    @Column
    private Integer quantidade;
}
```

## Funcionalidade
- Como o repositório é apenas da API REST feita, o frontend é inexistente, deixando o consumo da API ser feita por Postman ou outros softwares de teste de API.
- A API conta apenas com métodos de inserção dos produtos e listagem dos mesmos.
```java
@PostMapping(value = "/save")
    public ResponseEntity<Product> save(@RequestBody Product product) {
        productService.save(product);
        return ResponseEntity.ok().body(product);
    }

    @GetMapping(value = "/listall")
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok().body(productService.findAll());
    }
```
## Como testar
- Clone o repositório e abra o código fonte do projeto.
- Substitua as credenciais para a conexão com o banco de dados da sua máquina local.
```properties
spring.application.name=Carrinho-de-compras-Spring

# Set here configurations for the database connection
spring.datasource.url=jdbc:postgresql://localhost:5432/seu_db
spring.datasource.username=seu_username
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
```
- Inicie o servidor da aplicação a partir da classe CarrinhoDeComprasSpringApplication
```java
@SpringBootApplication
public class CarrinhoDeComprasSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(CarrinhoDeComprasSpringApplication.class, args);
	}
}
```
## Tecnologias usadas
[![Intellij](https://skillicons.dev/icons?i=idea&theme=dark)](https://www.jetbrains.com/pt-br/idea/)
[![Java](https://skillicons.dev/icons?i=java&theme=dark)](https://www.java.com/pt-BR/)
[![Spring](https://skillicons.dev/icons?i=spring&theme=dark))](https://spring.io/projects/spring-framework)
[![PostgreSQL](https://skillicons.dev/icons?i=postgres&theme=dark)](https://www.postgresql.org/)
[![Postman](https://skillicons.dev/icons?i=postman&theme=dark)](https://www.postman.com)
