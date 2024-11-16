package com.example.demo.servicio;

import com.example.demo.model.Autor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceAutor {

    List<Autor> getAll();
}
