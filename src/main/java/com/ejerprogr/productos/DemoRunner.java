package com.ejerprogr.productos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DemoRunner implements CommandLineRunner {

    @Autowired
    private ProductoService productoService;

    @Override
    public void run(String... args) throws Exception {

        // 1. Guardar productos de prueba
        Producto p1 = productoService.guardar(new Producto("Teclado", 15000.0, 10));
        Producto p2 = productoService.guardar(new Producto("Mouse", 8000.0, 25));
        Producto p3 = productoService.guardar(new Producto("Monitor", 90000.0, 5));

        // 2. Listar ordenado por precio
        System.out.println("=== Listado ordenado por precio ===");
        List<Producto> listado = productoService.listarOrdenado();
        listado.forEach(System.out::println);

        // 3. Modificar un parámetro (stock) de un producto
        System.out.println("\n=== Modificando stock del producto id=" + p1.getId() + " ===");
        Producto actualizado = productoService.modificarStock(p1.getId(), 3);
        System.out.println("Producto actualizado: " + actualizado);

        // 4. Borrar un producto
        System.out.println("\n=== Borrando producto id=" + p2.getId() + " ===");
        productoService.borrar(p2.getId());

        // 5. Listado final para confirmar los cambios
        System.out.println("\n=== Listado final ===");
        productoService.listarOrdenado().forEach(System.out::println);
    }
}
