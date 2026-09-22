# SGM - Spring Boot API (Dilly Sports)

Versão em Spring Boot do Sistema de Gerenciamento de Manutenção, expondo os dados via API REST.

## Sobre o projeto

Recriação do módulo de Máquinas e Ordens de Serviço do SGM original (Java puro), agora usando Spring Boot, Spring Data JPA e uma API REST completa, testada via Postman.

## Tecnologias utilizadas

- Java 21
- Spring Boot 4.1.1 (Spring Web, Spring Data JPA)
- MySQL 8.0
- Maven
- Postman (para testes)

## Funcionalidades

### Máquinas (`/maquinas`)
- GET, POST, PUT, DELETE

### Ordens de Serviço (`/ordens-servico`)
- GET, POST, PUT, DELETE
- Relacionamento com Máquina via `@ManyToOne`

## Como rodar

1. Configure o banco em `src/main/resources/application.properties`
2. Execute:

```bash
./mvnw spring-boot:run
```

3. Teste os endpoints em `http://localhost:8080/maquinas` e `http://localhost:8080/ordens-servico`

## Observação

Este projeto foi criado como exercício de aprendizado de Spring Boot, recriando o SGM original. Métricas (MTTR/MTBF) ainda não foram implementadas nesta versão.