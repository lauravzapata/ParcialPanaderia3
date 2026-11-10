module co.edu.uniquindio.poo.panaderia {
    requires javafx.controls;
    requires javafx.fxml;

    exports co.edu.uniquindio.poo.panaderia.model;
    exports co.edu.uniquindio.poo.panaderia.controller;
    exports co.edu.uniquindio.poo.panaderia.app;
    exports co.edu.uniquindio.poo.panaderia.viewcontrollers;

    opens co.edu.uniquindio.poo.panaderia.viewcontrollers to javafx.fxml;
}
