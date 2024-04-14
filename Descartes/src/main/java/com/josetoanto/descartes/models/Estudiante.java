package com.josetoanto.descartes.models;

public class Estudiante {
    String nombre;
    String matricula;

    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }
}
