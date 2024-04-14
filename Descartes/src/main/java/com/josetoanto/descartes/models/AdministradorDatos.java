package com.josetoanto.descartes.models;

public interface AdministradorDatos {
    void save(Estudiante newEstudiante);
    void update(int index, Estudiante estudiante);
}
