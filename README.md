
---

# 📦 Product API - Spring Boot

Esta é uma API RESTful para gerenciamento de produtos, desenvolvida como parte do meu aprofundamento em engenharia de software backend. O projeto foca em boas práticas como o uso de **DTOs**, tratamento global de exceções e documentação automatizada.

## 🚀 Funcionalidades

 **CRUD Completo**: Cadastro, listagem, atualização e exclusão de produtos.
 **Validação de Dados**: Garante a integridade das informações enviadas.
 **Tratamento de Erros**: Respostas HTTP amigáveis e padronizadas para exceções.
 **Documentação**: Interface interativa para testes via Swagger UI.

## 🛠️ Tecnologias Utilizadas

 **Linguagem**: Java 17
 **Framework**: Spring Boot 3
 **Persistência**: Spring Data JPA
 **Banco de Dados**: H2 (Desenvolvimento) / PostgreSQL (Produção)
 **Documentação**: OpenAPI 3 / Swagger

## 📂 Estrutura do Projeto

A arquitetura segue o padrão de camadas para facilitar a manutenção:

`controller`: Camada de entrada (Entrypoints).
`services`: Regras de negócio.
`database.model`: Entidades mapeadas para o banco.
`dto`: Objetos de transferência de dados.
`exception/handler`: Centralização de mensagens de erro.

## 🚦 Como Testar

1. Clone o repositório.
2. Certifique-se de ter o Maven instalado.
3. Execute o comando: `./mvnw spring-boot:run`.
4. Acesse a documentação interativa em: `http://localhost:8085/swagger-ui/index.html`.

## 📸 Demonstração

![POST](assets/POST.jpg)

---
