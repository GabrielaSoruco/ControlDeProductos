
# CRUD - JAVA - MySql - Spring Boot

Aplicación de negocios Java con función CRUD hecha para el control de productos tecnológicos.

    1. Agregar un nuevo producto
    2. Listar todos los productos
    3. Actualizar un producto
    4. Eliminar un producto
    5. Buscar un producto por su nombre, o marca, o procedencia


## Roadmap

- Crear base de datos 
```http
  CREAT DATABASE CONTROL_PRODUCTOS
```

- Seleccionar base de datos
```http
  USE CONTROL_PRODUCTOS
```
- Configuracion application properties
```http
spring.datasource.url=jdbc:mysql://localhost:3306/control_productos?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false
spring.datasource.username=
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.open-in-view=true
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.format_sql=true
```

## API Reference

#### Get --> obtener todos los productos

```http
  GET /
```
#### Get --> redirigir al formulario de registro

```http
  GET /nuevo
```
#### Post --> registrar nuevo producto

```http
  POST /guardar
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `nombre`      | `string` | **Required**. 
| `marca`      | `string` | **Required**. 
| `hechoEn`      | `string` | **Required**.
| `precio`      | `float` | **Required**.  

#### Get --> editar producto según id

```http
  GET /editar/{id}
```

#### Get --> eliminar producto según id

```http
  GET /eliminar/{id}
```


