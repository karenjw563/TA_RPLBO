module com.example.rentalmobil {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rentalmobil to javafx.fxml;
    exports com.example.rentalmobil;
}