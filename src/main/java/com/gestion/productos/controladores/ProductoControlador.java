package com.gestion.productos.controladores;

import com.gestion.productos.entidades.Producto;
import com.gestion.productos.servicios.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductoControlador {

    @Autowired
    private ProductoServicio productoServicio;

    // Pagina de inicio
    @GetMapping(value = "/")
    public String verIndex(Model modelo, @Param("palabraClava")String palabraClave) {
        List<Producto> listaProductos = productoServicio.getListaProductos(palabraClave);
        modelo.addAttribute("listaProductos", listaProductos);
        modelo.addAttribute("palabraClave", palabraClave);
        return "index";
    }

    // Método que redirige al formulario de registro
    @GetMapping(value = "/nuevo")
    public String agregarProducto(Model modelo){
        Producto producto = new Producto();
        modelo.addAttribute("producto", producto);
        return "nuevo_producto";
    }

    // Método para registrar nuevo producto
    @PostMapping(value = "/guardar")
    public String guardarProducto(@ModelAttribute("producto")Producto producto){
        productoServicio.saveProducto(producto);
        return "redirect:/";
    }

    // Método para editar producto, redirige al formulario del producto
    @GetMapping(value = "/editar/{id}")
    public ModelAndView mostrarFormParaEditarProducto(@PathVariable(name = "id") Long id){
        ModelAndView mav = new ModelAndView("editar_producto");

        Producto producto = productoServicio.getProductoById(id);
        mav.addObject("producto", producto);
        return mav;
    }

    @GetMapping(value = "/eliminar/{id}")
    public String eliminarProducto(@PathVariable(name = "id") Long id){
        productoServicio.deleteProducto(id);
        return "redirect:/";
    }

}
