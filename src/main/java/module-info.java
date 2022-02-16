module com.example.impossiblecoveragetemp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.impossiblecoveragetemp to javafx.fxml;
    exports com.example.impossiblecoveragetemp;
}