/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Adri
 */
public class Tienda {
    String productos;
    Integer precio;

    public Tienda() {
    }

    public Tienda(String productos, Integer precio) {
        this.productos = productos;
        this.precio = precio;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tienda{" + "productos=" + productos + ", precio=" + precio + '}';
    }
    
    
}
