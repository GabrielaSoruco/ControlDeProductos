package com.gestion.productos.repositorios;

import com.gestion.productos.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Long> {

    @Query(value = "SELECT p FROM Producto p WHERE p.nombre LIKE %?1%" +
            "OR p.marca LIKE %?1% OR p.hechoEn LIKE %?1%")
    List<Producto> findAll(String palabraClave);
}
