package ej5;

import entidades.Paises;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.ServiciosPaises;

public class main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Paises> paises = new ArrayList<>();

        ServiciosPaises serP = new ServiciosPaises(read, paises);

        String respuesta;

        do {
            serP.crearPaises();

            System.out.println("¿Quiere ingresar otro pais?"); //
            respuesta = read.next();

        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("========================");
        System.out.println("La lista de Paises es:");
        serP.mostrarPaises();
        System.out.println("========================");
        System.out.println("Paises ordenados alfabeticamete");
        serP.ordenarAlf();
        System.out.println("========================");
        serP.BuscaryEliminar();
        System.out.println("========================");
        serP.mostrarPaises();
    }
}
