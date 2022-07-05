package ej6;

import entidades.Tienda;
import java.util.HashMap;
import java.util.Scanner;
import servicios.serviciosTienda;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        HashMap<String, Tienda> productos = new HashMap();

        serviciosTienda serT = new serviciosTienda(read, productos);

        int respuestaSwitch;
        String respuesta;

        System.out.println("Seleccione una opcion");
        System.out.println("======================");
        serT.menu();
        System.out.println("======================");
        respuestaSwitch = read.nextInt();

        while (respuestaSwitch != 6) {

            switch (respuestaSwitch) {
                case 1:
                    do {
                        serT.crearTienda();
                        System.out.println("¿Quiere ingresar otro producto?");
                        respuesta = read.next();
                    } while (respuesta.equalsIgnoreCase("si"));
                    serT.menu();
                    respuestaSwitch = read.nextInt();
                    break;

                case 2:
                    System.out.println("Los objetos en la lista son");
                    System.out.println("======================");
                    serT.mostrarProductos();
                    System.out.println("======================");
                    serT.menu();
                    respuestaSwitch = read.nextInt();
                    break;
                case 3:
                    serT.modificarPrecio();
                    serT.menu();
                    respuestaSwitch = read.nextInt();
                    break;
                case 4:
                    serT.eliminarProducto();
                    serT.menu();
                    respuestaSwitch = read.nextInt();
            }

        }

    }

}
