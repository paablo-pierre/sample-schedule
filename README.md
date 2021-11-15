<h4 align="center">  
  🚀 Challenger Sample Schedule API - Unilabs.pt
<br>

## 💻 Project

Este desafio é um crud para um agendamento de exames pelo paciente.

## Tecnologias utilizadas:
-  FlywayDB;
- Java 11;
- Spring boot 2.5.6;
- PostgreSQL 14;
- h2 Database para testes;
- JUnit;
- Lombok;
- Spring Security.

## :wrench:    Config Inicial
Configuração no arquivo docker-compose.yml <p>
Acesse o diretório infra e execute o arquiovo com o comando docker-compose up -d

## :hammer: Instalação

No diretorio do projeto execute:
```  
mvn clean test
mvn spring-boot:run  
```  
A aplicação será executada na porta 8090.

Ao executar a aplicação será executado um script para popular a base de dados através do flyway.

## Como executar requests

A aplicação possui dois endpoints, um para listar os agendamentos já feitos e outro para criar um agendamento:
````
É possível utilizar a collection contida em src/config e importá-la no postman.
````