package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Libro extends Identifiable{

    private String nombre;
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    private Autor autor;
}
