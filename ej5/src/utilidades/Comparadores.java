/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidades.Paises;
import java.util.Comparator;

/**
 *
 * @author Adri
 */
public class Comparadores {
    
    public static Comparator<Paises> ordenarAlfab = (Paises t,Paises t1) -> t.getPais().compareTo(t1.getPais());
}
