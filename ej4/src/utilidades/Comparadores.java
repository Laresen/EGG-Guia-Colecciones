/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Adri
 */
public class Comparadores {
 
    public static Comparator<Pelicula> ordenarMayorMenor = (Pelicula t, Pelicula t1) -> t1.getHora().compareTo(t.getHora());
    
    public static Comparator<Pelicula> ordenarMenorMayor = (Pelicula t, Pelicula t1) -> t.getHora().compareTo(t1.getHora());
    
    public static Comparator<Pelicula> ordenarTituloAlfab = (Pelicula t,Pelicula t1) -> t.getTitulo().compareTo(t1.getTitulo());
    
    public static Comparator<Pelicula> ordenarDirectorAlfab = (Pelicula t,Pelicula t1) -> t.getDirector().compareTo(t1.getDirector());
    
    
    
    
}
