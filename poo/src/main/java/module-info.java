module com.projetoopoo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;
    requires java.logging;
     
    opens com.projetoopoo to javafx.fxml;
    exports com.projetoopoo;
}
