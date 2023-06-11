package com.example.housing;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginPage {

    @FXML
    private Button btnLogin;

    @FXML
    private Label lblError;

    @FXML
    private Button btnSignUpLogin;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;


    @FXML
    void pressBtnLogin(ActionEvent event) throws SQLException, IOException {
        java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Housing", "root", "");
        Statement statement = connection.createStatement();

        boolean bln = false;
        try {
            ResultSet rs = statement.executeQuery("SELECT  Id , password FROM person");
            while (rs.next()) {
                String username = rs.getString("Id");
                String password = rs.getString("password");
                if (txtUsername.getText().compareTo(username) == 0 && txtPassword.getText().compareTo(password) == 0) {
                    bln = true;
                    Stage stage = (Stage) btnLogin.getScene().getWindow();
                    stage.close();
                    Stage primaryStage = new Stage();
                    AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("mainPage.fxml"));
                    Scene scene = new Scene(root, 650, 450);
                    primaryStage.setScene(scene);
                    primaryStage.show();
                    break;
                }
            }
            if (bln == false) {
                lblError.setVisible(true);
                txtUsername.setText("");
                txtPassword.setText("");
            }


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


        @FXML
        void pressBtnSignUpLogin (ActionEvent event) throws IOException {
        Stage stage = (Stage) btnSignUpLogin.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("register.fxml"));
        Scene scene = new Scene(root, 650, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
        }

    }

