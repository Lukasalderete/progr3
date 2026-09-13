package com.ejerprogr.productos;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    // Consulta que ordena el listado de productos por precio ascendente
    List<Producto> findAllByOrderByPrecioAsc();
}