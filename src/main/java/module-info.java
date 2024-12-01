module com.example.stockexchange {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.stockexchange to javafx.fxml;
    exports com.example.stockexchange;
}