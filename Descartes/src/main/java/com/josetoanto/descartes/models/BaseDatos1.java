package com.josetoanto.descartes.models;

import java.util.ArrayList;

public class BaseDatos1 implements AdministradorDatos {

    private ArrayList<Estudiante> listaEstudiante = new ArrayList<>();

    @Override
    public void save(Estudiante newEstudiante) {
        this.listaEstudiante.add(newEstudiante);
        System.out.println("Guardo en base de datos 1");
    }

    @Override
    public void update(int index, Estudiante estudiante) {
        this.listaEstudiante.set(index,estudiante);
        System.out.println("Actualizado en base da datos 1");
    }

    public ArrayList<Estudiante> getListaEstudiante() {
        return listaEstudiante;
    }
}
