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
Com o maven instalado e configurado na máquina:

Acesse o arquivo application.yml em src/resources e altere para o seguinte profile:
```
spring:
  profiles:
    active: docker
```

No diretorio do projeto execute:
```  
mvn clean test
mvn package -DskipTests  
```  

Na raiz do projeto faça o build da imagem docker da aplicação:
```
docker build -t sample-schedule .
```
Com a imagem acima gerada é possível subir o docker-compose com uma instância do banco de dados PostgreSQL <p>
Na raiz do projeto execute o seguinte comando:
```
cd infra
docker-compose up
```

A aplicação será executada na porta 8090.

Ao executar a aplicação será executado um script para popular a base de dados através do flyway.

## Como executar requests

A aplicação possui dois endpoints, um para listar os agendamentos já feitos e outro para criar um agendamento:
````
É possível utilizar a collection no postman contida em src/config e importá-la no postman.
````