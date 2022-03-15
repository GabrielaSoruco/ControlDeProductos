package com.gestion.productos.servicios;

import com.gestion.productos.entidades.Producto;

import java.util.List;

public interface ProductoServicio {
    List<Producto> getListaProductos(String palabraClave);
    void saveProducto(Producto producto);
    Producto getProductoById(Long id);
    void deleteProducto(Long id);
}
