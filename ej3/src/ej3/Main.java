/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Alumno> alumnos = new ArrayList();

        String respuesta = "";

        do {
            Alumno al = new Alumno();
            System.out.println("Ingrese el nombre del Alumno");
            String nombre = read.next();

            System.out.println("Ingrese la nota 1");
            int nota1 = read.nextInt();

            System.out.println("Ingrese la nota 2");
            int nota2 = read.nextInt();

            System.out.println("Ingrese la nota 3");
            int nota3 = read.nextInt();

            al.setNombre(nombre);
            al.setNota1(nota1);
            al.setNota2(nota2);
            al.setNota3(nota3);

            alumnos.add(al);// Agregamos el objeto llenado a la lista
            System.out.println("Quiere ingresar otro alumno ?"); // Y preguntamos si quiere ingresar otro alumno 
            respuesta = read.next();

        } while (respuesta.equalsIgnoreCase("si"));

        // Aca los mostramos en un for each
        for (Alumno alumno : alumnos) {
            System.out.println(alumnos);
        }

        System.out.println("Que estudiante quiere calcular su nota final? ");
        String nombreAlumno = read.next();

        for (Alumno alumno : alumnos) { // Recorremos la lista

            // Validamos si está el alumno que queremos calcular la nota final
            if (nombreAlumno.equalsIgnoreCase(alumno.getNombre())) {

                // Usamos el objeto alumno creado en el for each para llamar el metodo para calcular la nota final
                System.out.println("La nota final de "
                        + alumno.getNombre() + " es " + alumno.notaFinal());
            }

        }
    }

}
