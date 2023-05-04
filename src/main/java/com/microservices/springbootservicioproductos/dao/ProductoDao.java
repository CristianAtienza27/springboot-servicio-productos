package com.microservices.springbootservicioproductos.models.dao;

import com.microservices.springbootservicioproductos.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository <Producto, Long> {
}
