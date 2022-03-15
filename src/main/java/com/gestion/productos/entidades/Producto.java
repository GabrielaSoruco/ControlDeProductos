package com.gestion.productos.entidades;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCTOS")
@Getter @Setter
@NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOMBRE", nullable = false, length = 50)
    private String nombre;

    @Column(name = "MARCA", nullable = false, length = 50)
    private String marca;

    @Column(name = "HECHO_EN", nullable = false, length = 50)
    private String hechoEn;

    @Column(name = "PRECIO", nullable = false)
    private float precio;

}
