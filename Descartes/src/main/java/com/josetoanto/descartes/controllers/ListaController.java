package com.josetoanto.descartes.controllers;

import com.josetoanto.descartes.models.Descartes;
import com.josetoanto.descartes.models.Estudiante;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ListaController {

    @FXML
    private ListView<String> listaEstudiantes;

    @FXML
    private TextField matriculaAlumno;

    @FXML
    private TextField nombreAlumno;

    private Descartes descartes = new Descartes();

    @FXML
    void ActualizarClick(MouseEvent event) {
        Estudiante estudiante = new Estudiante(nombreAlumno.getText(),matriculaAlumno.getText());
        if (!listaEstudiantes.getSelectionModel().isEmpty()){
            descartes.getBaseDatos1().update(listaEstudiantes.getSelectionModel().getSelectedIndex(),estudiante);
            descartes.getBaseDatos2().update(listaEstudiantes.getSelectionModel().getSelectedIndex(),estudiante);
            descartes.getBaseDatos3().update(listaEstudiantes.getSelectionModel().getSelectedIndex(),estudiante);
            actualizarLista();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Porfavor, seleccione el alumno a actualizar");
            alert.showAndWait();
        }
    }

    @FXML
    void AgregarClick(MouseEvent event) {
        Estudiante estudiante = new Estudiante(nombreAlumno.getText(),matriculaAlumno.getText());
        descartes.getBaseDatos1().save(estudiante);
        descartes.getBaseDatos2().save(estudiante);
        descartes.getBaseDatos3().save(estudiante);
        actualizarLista();
    }

    @FXML
    void onSalirClick(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    void actualizarLista(){
        listaEstudiantes.getItems().clear();
        for (Estudiante estudiante: descartes.getBaseDatos1().getListaEstudiante()){
            listaEstudiantes.getItems().add(estudiante.getNombre() + "(" + estudiante.getMatricula() + ")");
        }
    }
}
