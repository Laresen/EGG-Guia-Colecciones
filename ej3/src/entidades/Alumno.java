/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Adri
 */
public class Alumno {

    private String nombre;
    private Integer nota1;
    private Integer nota2;
    private Integer nota3;

    public Alumno() {
    }

    public Alumno(String nombre, Integer nota1, Integer nota2, Integer nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota1() {
        return nota1;
    }

    public void setNota1(Integer nota1) {
        this.nota1 = nota1;
    }

    public Integer getNota2() {
        return nota2;
    }

    public void setNota2(Integer nota2) {
        this.nota2 = nota2;
    }

    public Integer getNota3() {
        return nota3;
    }

    public void setNota3(Integer nota3) {
        this.nota3 = nota3;
    }

    

    public int notaFinal() {
        int notaFinal;
        notaFinal = (nota1 + nota2 + nota3) / 3;
        return notaFinal;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + '}';
    }



}
