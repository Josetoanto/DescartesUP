module com.josetoanto.descartes {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.josetoanto.descartes to javafx.fxml;
    exports com.josetoanto.descartes;
    exports com.josetoanto.descartes.controllers;
    opens com.josetoanto.descartes.controllers to javafx.fxml;
}