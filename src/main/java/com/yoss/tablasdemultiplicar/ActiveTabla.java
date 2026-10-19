package com.yoss.tablasdemultiplicar;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ActiveTabla {
    @FXML
    private TextField txtTablaDe;
    @FXML
    private Label lblRes;
    @FXML
    private String CalcularTabla(int a){
        String res = "";

        for(int i = 1; i<=12; i++){
            res += a + " x " + i + " = " + (a * i) + "\n";
        }
        return res;
    }

    @FXML
    private void calcular(){
        int a = 0;
        a = Integer.parseInt(txtTablaDe.getText());
        lblRes.setText(CalcularTabla(a));
    }

    @FXML
    private void limpiar(){
        txtTablaDe.clear();
        lblRes.setText("");
    }
}
    
    
    
 
