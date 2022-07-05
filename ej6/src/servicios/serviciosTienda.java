/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class serviciosTienda {

    private final Scanner read;

    private final Tienda t = new Tienda();

    private final HashMap<String, Tienda> productos;

    public serviciosTienda(Scanner read, HashMap<String, Tienda> productos) {
        this.read = read;
        this.productos = productos;
    }

    public void crearTienda() {
        Tienda ti = new Tienda();

        System.out.println("Ingrese un producto");
        String produc = read.next();

        System.out.println("ingrese el precio del producto");
        int precio = read.nextInt();

        ti.setPrecio(precio);
        ti.setProductos(produc);

        productos.put(produc, ti);

    }

    public void mostrarProductos() {

        for (Map.Entry<String, Tienda> entry : productos.entrySet()) {
            System.out.println("producto=" + entry.getKey() + ", precio=" + entry.getValue().getPrecio());
        }
    }

    public void menu() {
        System.out.println("Seleccione una opcion");
        System.out.println("1-Ingrear productos");
        System.out.println("2-Ver productos");
        System.out.println("3-Modificar Precio");
        System.out.println("4-Eliminar un Producto");
        System.out.println("5-Salir");
    }

    public void modificarPrecio() {
        int newPrice;
        String producto;
        System.out.println("Ingresa el nombre del  producto que desea modificar");
        producto = read.next();
        System.out.println("Ingresa el nuevo precio");
        newPrice = read.nextInt();
        if (productos.containsKey(producto)) {
            Tienda ti1 = productos.get(producto);
            ti1.setPrecio(newPrice);
            productos.replace(producto, ti1);
        }
    }

    public void eliminarProducto() {
        String prodAeliminar;
        System.out.println("Ingresa el producto que desea eliminar");
        prodAeliminar = read.next();
        if (productos.containsKey(prodAeliminar)) {
            productos.remove(prodAeliminar);
            System.out.println("El producto a sido eliminado");
        }
    }
}
