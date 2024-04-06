module org.example.localizingdb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;


    opens org.example.localizingdb to javafx.fxml;
    exports org.example.localizingdb;
}