package com.example.demo.controller;

import com.example.demo.model.Autor;
import com.example.demo.servicio.IServiceAutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/autor")
public class ServiceAutor {

    @Autowired
    private IServiceAutor service;

    @GetMapping("/all")
    public List<Autor> getAll() {
        return service.getAll();
    }

    @PostMapping("/create")
    public void createAutor(@RequestBody Autor autor) {
        service.save(autor);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAutor(@PathVariable("id") UUID id) {
        service.delete(id);
    }

    @PutMapping("/update")
    public Autor updateAutor(@RequestBody Autor autor) {
        return service.update(autor);
    }

    @GetMapping("/{id}")
    public Autor getById(@PathVariable("id") UUID id) {
        return service.getId(id);
    }

}
