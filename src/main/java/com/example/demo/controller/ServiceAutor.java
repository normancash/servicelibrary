package com.example.demo.controller;

import com.example.demo.model.Autor;
import com.example.demo.servicio.IServiceAutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/autor")
public class ServiceAutor {

    @Autowired
    private IServiceAutor serviceAutor;

    @GetMapping("/all")
    public List<Autor> getAll() {
        return serviceAutor.getAll();
    }

}
