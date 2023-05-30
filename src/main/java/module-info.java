module com.example.tutorialspointjfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tutorialspointjfx to javafx.fxml;
    exports com.example.tutorialspointjfx;
}