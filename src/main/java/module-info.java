module com.example.stockexchange {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires atlantafx.base;

    opens com.example.stockexchange to javafx.fxml;
    opens com.example.stockexchange.controller to javafx.fxml;

    exports com.example.stockexchange;
}