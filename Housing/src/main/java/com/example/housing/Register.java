package com.example.housing;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;


public class Register {

    @FXML
    private Button btnSignUp;

    @FXML
    private Label lblRegisterError;

    @FXML
    private TextField txtFirstName;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtLastName;

    @FXML
    private TextField txtPassword;

    @FXML
    void pressBtnSignUp() throws IOException, SQLException {
        if (txtFirstName.getText().compareTo("")==0 || txtLastName.getText().compareTo("")==0 || txtID.getText().compareTo("")==0 || txtPassword.getText().compareTo("")==0){
            lblRegisterError.setVisible(true);
        }
        else{
            var person = new Person();
            person.setFirstName(txtFirstName.getText());
            person.setLastName(txtLastName.getText());
            person.setId(txtID.getText());
            person.setPassword(txtPassword.getText());

            var database = new DataBase();
            database.signUp(person);


            Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
            alert2.setTitle("Information Dialog");
            alert2.setHeaderText(null);
            alert2.setContentText("Successfully Registered!!");
            alert2.showAndWait();

            Stage stage =(Stage) btnSignUp.getScene().getWindow();
            stage.close();
            Stage primaryStage=new Stage();
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
            Scene scene = new Scene(root,650,450);
            primaryStage.setScene(scene);
            primaryStage.show();






        }
    }

}
