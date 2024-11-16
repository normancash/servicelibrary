package com.example.demo.servicio;


import com.example.demo.model.Autor;
import com.example.demo.repository.IAuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAutorImpl implements IServiceAutor{

    @Autowired
    private IAuthorRepo repo;

    @Override
    public List<Autor> getAll() {
        return repo.findAll();
    }
}
