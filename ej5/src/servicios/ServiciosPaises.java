/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author Adri
 */
public class ServiciosPaises {

    private final Scanner read;

    private final Paises p = new Paises();

    private final ArrayList<Paises> paises;

    public ServiciosPaises(Scanner read, ArrayList<Paises> paises) {
        this.read = read;
        this.paises = paises;
    }

    public Paises crearPaises() {
        Paises pa = new Paises();

        System.out.println("Ingresa un pais");

        String pais = read.next();

        pa.setPais(pais);

        paises.add(pa);

        return pa;

    }

    public void mostrarPaises() {

        for (Paises listPaise : paises) {
            System.out.println(listPaise);
        }
    }

    public void ordenarAlf() {
        Collections.sort(paises, Comparadores.ordenarAlfab);

        for (Paises paise : paises) {
            System.out.println(paise);
        }

    }

    public void BuscaryEliminar() {
        System.out.println("Ingresa un pais a buscar");
        String busq = read.next();

        Iterator<Paises> it2 = paises.iterator();

        boolean eliminado = false;
        
        while (it2.hasNext()) {

            if (it2.next().getPais().equalsIgnoreCase(busq)) { 
                it2.remove();
                eliminado=true;
            } 
            
        if (eliminado) {

            for (Paises aux : paises) { // Aca los mostramos en un for each

                System.out.println(aux);

            }

        } else {

            System.out.println("El Pais a eliminar no se encuentra en la lista");

        }
        }
    }
}
