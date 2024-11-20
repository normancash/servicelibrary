package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class AutorLibroDTO {

    private AutorDTO autorDto;
    private Set<LibroDTO> librosDto;
}
