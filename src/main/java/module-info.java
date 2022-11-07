module uz.bakhromjon.scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens uz.bakhromjon.scenebuilder to javafx.fxml;
    exports uz.bakhromjon.scenebuilder;
}