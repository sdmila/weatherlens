module csc325 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.google.gson;

    opens csc325 to javafx.fxml;
    exports csc325;
}
