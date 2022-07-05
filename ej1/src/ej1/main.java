/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.*/

 /*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada*/
package ej1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> razasPerros = new ArrayList(); // Creamos una lista de Strings
        String raza;
        String respuesta = "";

        do {
            System.out.println("Ingresa una raza de perro");
            raza = read.next();
            razasPerros.add(raza);

            System.out.println("¿Quiere ingresar otra raza?");
            respuesta = read.next();

        } while (respuesta.equalsIgnoreCase("Si"));

        /*Recorremos la lista con un for each*/
        for (String cadena : razasPerros) {
            System.out.println("Las razas de perros ingesadas son:");
            System.out.println(cadena);
        }
        System.out.println("Ingresa un perro a buscar");
        raza = read.next();

        //lista recorrida con un Interator
        System.out.println("===================================");
        System.out.println("Recorremos la lista con un iterator");
        Iterator<String> it = razasPerros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Usamos el iterator para remover un elemento
         System.out.println("===================================");
        System.out.println("Usamos el iterator para remover un elemento");
        Iterator<String> it2 = razasPerros.iterator();

        while (it2.hasNext()) {
            if (it2.next().equals(raza)) { // Borramos 
                it2.remove();
            }else if (!it2.next().equals(raza)) {
                System.out.println("El perro no se encuentra en la lista");
                break;
            }
        }
        for (String string : razasPerros) {
            System.out.println("Las razas de perros son");
            System.out.println(string);

        }

    }
}
