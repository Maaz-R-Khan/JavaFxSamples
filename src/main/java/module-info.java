module com.example.javafxsamples {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.javafxsamples to javafx.fxml;
    exports com.example.javafxsamples;
}