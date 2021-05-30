package org.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField str1;

    @FXML
    private TextField str2;


    @FXML
    void buttonChek(ActionEvent event) {

        if(chekTextFieldEmpty()){
            errorMessage("Введите строку символом в первое поле");

        }
        else{
            String first_string = (str1.getText());
            String second_string;
            second_string = Util.reverseString(first_string);
            str2.setText(second_string);
        }

    }



    @FXML
    void initialize() { }


    public boolean chekTextFieldEmpty(){

        if(str1.getText().equals("")){
           return true;
        }
        return false;
    }

    public void errorMessage(String message){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ошибка");
        alert.setHeaderText(message);
        alert.showAndWait();
    }



}





