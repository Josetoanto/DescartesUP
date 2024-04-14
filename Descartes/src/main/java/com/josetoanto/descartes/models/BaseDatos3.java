package com.josetoanto.descartes.models;

import java.util.ArrayList;

public class BaseDatos3 implements AdministradorDatos {

    private ArrayList<Estudiante> listaEstudiante = new ArrayList<>();

    @Override
    public void save(Estudiante newEstudiante) {
        this.listaEstudiante.add(newEstudiante);
        System.out.println("Guardado en base de datos 3");
    }

    @Override
    public void update(int index, Estudiante estudiante) {
        this.listaEstudiante.set(index,estudiante);
        System.out.println("Actualizado en base de datos 3");
    }
}
