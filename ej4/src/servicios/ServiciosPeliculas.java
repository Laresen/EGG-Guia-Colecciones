/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Pelicula;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author Adri
 */
public class ServiciosPeliculas {

    private final Scanner read;

    private final Pelicula pel = new Pelicula();

    private final List<Pelicula> peliculas;

    public ServiciosPeliculas(Scanner read, List<Pelicula> peliculas) {
        this.read = read;
        this.peliculas = peliculas;
    }

    public Pelicula crearPelicula() {
        Pelicula pel1 = new Pelicula();

        System.out.println("Ingresa el titulo de la pelicula");
        String titulo = read.next();

        System.out.println("Ingresa el nombre del director");
        String director = read.next();

        System.out.println("Ingresa la duracion de la pelicula en horas ");
        int hora = read.nextInt();

        pel1.setTitulo(titulo);
        pel1.setDirector(director);
        pel1.setHora(hora);

        peliculas.add(pel1);

        /*listaPeliculas.add(new Pelicula(titulo, director, duracion));*/
        return pel1;
    }

    public void mostrarPeliculas() {
        System.out.println("Las Peliculas actuales en la lista son");
        peliculas.forEach((aux) -> {
            System.out.println(aux);
        });
    }

    public void duraciomMayorUnoHora() {
        for (Pelicula aux : peliculas) {
            if (aux.getHora() > 1) {
                System.out.println(aux.toString());
            }
        }
    }

    public void ordenarMayorMenor() {
        Collections.sort(peliculas, Comparadores.ordenarMayorMenor);

        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void ordenarMenorMayor() {
        Collections.sort(peliculas, Comparadores.ordenarMenorMayor);

        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void ordenarPorTitulo() {

        Collections.sort(peliculas, Comparadores.ordenarTituloAlfab);

        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }

    }

    public void ordenarPorDirector() {
        Collections.sort(peliculas, Comparadores.ordenarDirectorAlfab);
       
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
}
