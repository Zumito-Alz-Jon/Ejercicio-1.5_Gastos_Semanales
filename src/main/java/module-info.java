module zumito_alz.ejercicio1.gastos.semanales {
    requires javafx.controls;
    requires javafx.fxml;

    opens zumito_alz.ejercicio1.gastos.semanales to javafx.fxml;
    exports zumito_alz.ejercicio1.gastos.semanales;
}
