package com.microservices.springbootservicioproductos.service;

import com.microservices.springbootservicioproductos.models.entity.Producto;

import java.util.List;

public interface IProductoService {
    List<Producto> findAll();

    Producto findById(Long id);

    Producto save(Producto producto);

    void deleteById(Long id);

}
