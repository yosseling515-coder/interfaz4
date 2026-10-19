module com.yoss.tablasdemultiplicar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.yoss.tablasdemultiplicar to javafx.fxml;
    exports com.yoss.tablasdemultiplicar;
}
