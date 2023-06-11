package com.example.housing;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPage {

    @FXML
    private Button btnBuyingHousing;

    @FXML
    private Button btnGrounds;

    @FXML
    private Button btnHousingForSale;

    @FXML
    private Button btnNewbuilding;

    @FXML
    private Button btnOldBuildings;

    @FXML
    private Button btnRentalHousing;

    @FXML
    private Button btnTransaction;

    @FXML
    private Button btnTransactionalPeople;

    @FXML
    public Label lblFirstName;

    @FXML
    private Label lblLastName;

    @FXML
    void pressBtnBuyingHousing(ActionEvent event) throws IOException {
        Stage stage = (Stage) btnBuyingHousing.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("buyingHousing.fxml"));
        Scene scene = new Scene(root, 650, 450);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @FXML
    void pressBtnGrounds(ActionEvent event) throws IOException {
        Stage stage = (Stage) btnGrounds.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("grounds.fxml"));
        Scene scene = new Scene(root, 650, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void pressBtnHousingForSale(ActionEvent event) throws IOException {
        Stage stage = (Stage) btnHousingForSale.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("housingForSale.fxml"));
        Scene scene = new Scene(root, 650, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void pressBtnNewbuilding(ActionEvent event) throws IOException {
        Stage stage = (Stage) btnNewbuilding.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("newBuildings.fxml"));
        Scene scene = new Scene(root, 650, 450);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @FXML
    void pressBtnOldBuildings(ActionEvent event) throws IOException {
        Stage stage = (Stage) btnOldBuildings.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("oldBuildings.fxml"));
        Scene scene = new Scene(root, 650, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void pressBtnRentalHousing(ActionEvent event) throws IOException {
        Stage stage = (Stage) btnRentalHousing.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("rentalHousing.fxml"));
        Scene scene = new Scene(root, 650, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }





}
