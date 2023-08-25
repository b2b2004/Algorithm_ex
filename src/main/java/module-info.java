module com.example.algorithm_ex {

    opens com.example.algorithm_ex to javafx.fxml;
    exports com.example.algorithm_ex;
    exports com.example.algorithm_ex.Ex01_String;
    opens com.example.algorithm_ex.Ex01_String to javafx.fxml;
}