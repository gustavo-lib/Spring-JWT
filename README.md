# Spring Security JWT DB

## Requisitos
- JDK 8 
- Maven 3.0
- Eclipse 
- Spring Boot
- Postman

## Dependencias del proyecto SpringBoot
- Spring Web
- Spring Data JPA
- Data Base MYSQL

## API Description 
### Endpoint Controller 

METHOD | PATH | DESCRIPTION 
------------|-----|------------
POST |http://localhost:8080/auth/login | user login body usuarioNombre-password
POST |http://localhost:8080/auth/nuevo | new user   body nombre-nombreUsuario-email-password-rol

