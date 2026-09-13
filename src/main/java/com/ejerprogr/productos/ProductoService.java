package com.ejerprogr.productos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    // Listado ordenado por precio
    public List<Producto> listarOrdenado() {
        return productoRepository.findAllByOrderByPrecioAsc();
    }

    // Modificar un parámetro del producto (el stock)
    public Producto modificarStock(Long id, Integer nuevoStock) {
        Optional<Producto> opt = productoRepository.findById(id);
        if (opt.isPresent()) {
            Producto producto = opt.get();
            producto.setStock(nuevoStock);
            return productoRepository.save(producto);
        }
        throw new RuntimeException("Producto no encontrado con id: " + id);
    }

    // Borrar un producto
    public void borrar(Long id) {
        productoRepository.deleteById(id);
    }
}