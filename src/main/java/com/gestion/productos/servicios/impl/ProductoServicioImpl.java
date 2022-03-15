package com.gestion.productos.servicios.impl;

import com.gestion.productos.entidades.Producto;
import com.gestion.productos.repositorios.ProductoRepositorio;
import com.gestion.productos.servicios.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicioImpl implements ProductoServicio {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Override
    public List<Producto> getListaProductos(String palabraClave){
        if(palabraClave != null){
            return productoRepositorio.findAll(palabraClave);
        }
        return productoRepositorio.findAll();
    }

    @Override
    public void saveProducto(Producto producto){
        productoRepositorio.save(producto);
    }

    @Override
    public Producto getProductoById(Long id){
        return productoRepositorio.findById(id).get();
    }

    @Override
    public void deleteProducto(Long id){
        productoRepositorio.deleteById(id);
    }

}
