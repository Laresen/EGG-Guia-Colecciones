package eje4;

import java.util.Scanner;
import entidades.Pelicula;
import java.util.ArrayList;
import servicios.ServiciosPeliculas;

public class main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Pelicula> peliculas = new ArrayList();

        ServiciosPeliculas servP = new ServiciosPeliculas(read, peliculas);

        String respuesta = "";

        do {
            servP.crearPelicula();

            System.out.println("Quiere ingresar otro pelicula ?"); //
            respuesta = read.next();

        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("=======================================");
        servP.mostrarPeliculas();
        System.out.println("=======================================");
        System.out.println("Películas con una duración mayor a 1 hora");
        servP.duraciomMayorUnoHora();

        System.out.println("Películas de acuerdo a su duración (de mayor a menor)");
        servP.ordenarMayorMenor();
        System.out.println("=======================================");

        System.out.println("Películas de acuerdo a su duración (de menor a Mayor)");
        servP.ordenarMenorMayor();
        System.out.println("=======================================");

        System.out.println("Películas por titulo, alfabéticamente");
        servP.ordenarPorTitulo();
        System.out.println("=======================================");

        System.out.println("Peliculas por Director Alfabeticamente");
        servP.ordenarPorDirector();
        System.out.println("=======================================");
    }

}
