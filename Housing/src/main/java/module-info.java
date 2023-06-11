module com.example.housing {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.internal.vm.ci;

    requires org.controlsfx.controls;
    requires java.sql;

    opens com.example.housing to javafx.fxml;
    exports com.example.housing;
}