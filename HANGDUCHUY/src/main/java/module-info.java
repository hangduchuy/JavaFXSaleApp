module com.mycompany.hangduchuy {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.hangduchuy to javafx.fxml;
    exports com.mycompany.hangduchuy;
}
