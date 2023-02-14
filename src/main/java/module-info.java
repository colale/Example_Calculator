module com.example.example_calculator {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.example_calculator to javafx.fxml;
    exports com.example.example_calculator;
}