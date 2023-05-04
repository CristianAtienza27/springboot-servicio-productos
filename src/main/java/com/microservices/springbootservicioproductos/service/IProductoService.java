package com.microservices.springbootservicioproductos.models.service;

import com.microservices.springbootservicioproductos.models.entity.Producto;

import java.util.List;

public interface IProductoService {
    List<Producto> findAll();

    Producto findById(Long id);
}
