module ru.vopros.chemistry {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens ru.vopros.chemistry to javafx.fxml;
    exports ru.vopros.chemistry;
}