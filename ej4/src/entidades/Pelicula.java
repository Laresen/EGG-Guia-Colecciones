/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Comparator;

/**
 *
 * @author Adri
 */
public class Pelicula {

    /*ATRIBUTOS*/
    private String titulo;
    private String director;
    private Integer hora;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer hora) {
        this.titulo = titulo;
        this.director = director;
        this.hora = hora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    
    @Override

    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", hora=" + hora + '}';
    }

}
