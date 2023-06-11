package com.example.housing;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Objects;
import javafx.scene.control.DatePicker;

public class BuyingHousing {
    @FXML
    private DatePicker calender;

    @FXML
    private TextField dtxtID;

    @FXML
    private Button btnMainPage;

    @FXML
    private TextField etxtAddress;

    @FXML
    private TextField etxtArea;
    @FXML
    private Button btnDone;
    @FXML
    private TextField etxtID;

    @FXML
    private TextField etxtPossibilities;

    @FXML
    private TextField etxtPrice;

    @FXML
    private TextField etxtSellerName;

    @FXML
    private ListView<String> listview;

    @FXML
    private TextField utxtAddress;

    @FXML
    private TextField utxtArea;

    @FXML
    private Button ShowbtnTransaction;

    @FXML
    private TextField utxtID;

    @FXML
    private TextField utxtPossibilities;

    @FXML
    private TextField utxtPrice;

    @FXML
    private TextField utxtSellerName;
    @FXML
    private TextField txtBuyername;

    @FXML
    private TextField txtFathername;

    @FXML
    private TextField txtFinalprice;

    @FXML
    private TextField txtHousingid;

    @FXML
    private TextField txtMelicode;
    @FXML
    private ListView<String> listTransactions;

    @FXML
    private TextField txtSellername;

    ObservableList<String>listShow = FXCollections.observableArrayList();
    ObservableList<String>listShow2 = FXCollections.observableArrayList();

    @FXML
    void dpressbtnEnter() throws SQLException {
        String ID = getDtxtID().getText();
        String type = "buyingHousing";
        var db = new DataBase();
        db.delete(ID , type);
        Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
        alert2.setTitle("Information Dialog");
        alert2.setHeaderText(null);
        alert2.setContentText("Successful!!");
        alert2.showAndWait();
    }

    @FXML
    void epressbtnEnter() throws SQLException {
        String type = "buyingHousing";
        String ID = getEtxtID().getText();
        String area = getEtxtArea().getText();
        String price = getEtxtPrice().getText();
        String sellerName = getEtxtSellerName().getText();
        String address = getEtxtAddress().getText();
        String pos = getEtxtPossibilities().getText();
        var db = new DataBase();
        db.entryGrounds(type, ID , area , price , sellerName , address , pos);
        Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
        alert2.setTitle("Information Dialog");
        alert2.setHeaderText(null);
        alert2.setContentText("Successful!!");
        alert2.showAndWait();
    }

    @FXML
    void pressShowbtn() throws SQLException {
        java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Housing", "root", "");
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM gandh WHERE type='buyingHousing';";
        ResultSet res = statement.executeQuery(sql);
        listview.getItems().clear();
        while(res.next()){
            String id = res.getString("ID");
            String area = res.getString("area");
            String price = res.getString("price");
            String name = res.getString("sellerName");
            String address = res.getString("address");
            String pos = res.getString("possibilities");
            listShow.add("ID : "+id + "     ||     "+"area : " + area + "     ||     "+"price : " +price+ "     ||     "+"name : " +name+ "     ||     "+"address : " +address+ "     ||     "+"possibilities : " +pos );

        }
        listview.setItems(listShow);



    }

    @FXML
    void upressbtnEnter() throws SQLException {
        String type = "buyingHousing";
        String id = utxtID.getText();
        String area = utxtArea.getText();
        String price = utxtPrice.getText();
        String name = utxtSellerName.getText();
        String address = utxtAddress.getText();
        String pos = utxtPossibilities.getText();
        var db = new DataBase();
        db.update( type ,id , area , price , name , address , pos);
        Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
        alert2.setTitle("Information Dialog");
        alert2.setHeaderText(null);
        alert2.setContentText("Successful!!");
        alert2.showAndWait();

    }

    @FXML
    void pressbtnMainPage() throws IOException {
        Stage stage =(Stage) btnMainPage.getScene().getWindow();
        stage.close();
        Stage primaryStage=new Stage();
        AnchorPane root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainPage.fxml")));
        Scene scene = new Scene(root,650,450);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    @FXML
    void pressbtnDone(ActionEvent event) throws SQLException {
        String type = "buyingHousing";
        String buyer = txtBuyername.getText();
        String seller = txtSellername.getText();
        String price = txtFinalprice.getText();
        String meli = txtMelicode.getText();
        String father = txtFathername.getText();
        String ID = txtHousingid.getText();
        LocalDate cal = calender.getValue();
        var db = new DataBase();
        db.transactionEnter(type , buyer , seller , price , meli , father , ID , cal);
        Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
        alert2.setTitle("Information Dialog");
        alert2.setHeaderText(null);
        alert2.setContentText("Successful!!");
        alert2.showAndWait();
    }
    @FXML
    void pressShowbtnTransaction(ActionEvent event) throws SQLException {
        java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Housing", "root", "");
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM transaction WHERE type='buyingHousing';";
        ResultSet res = statement.executeQuery(sql);
        listTransactions.getItems().clear();
        while(res.next()){
            String buyer = res.getString("buyerName");
            String seller = res.getString("sellerName");
            String price = res.getString("finalPrice");
            String meli = res.getString("meliCode");
            String father = res.getString("fatherName");
            String ID = res.getString("housingID");
            String cal = String.valueOf(res.getDate("calender"));
            listShow2.add("buyer name : "+buyer + "     ||     "+"seller name : " + seller + "     ||     "+"final price : " +price+ "     ||     "+"meli code : " +meli+ "     ||     "+"father name : " +father+ "     ||     "+"housing ID : " +ID+ "     ||     "+"date : " + cal);

        }
        listTransactions.setItems(listShow2);

    }


    public TextField getDtxtID() {
        return dtxtID;
    }


    public TextField getEtxtAddress() {
        return etxtAddress;
    }


    public TextField getEtxtArea() {
        return etxtArea;
    }

    public TextField getEtxtID() {
        return etxtID;
    }

    public TextField getEtxtPossibilities() {
        return etxtPossibilities;
    }

    public TextField getEtxtPrice() {
        return etxtPrice;
    }


    public TextField getEtxtSellerName() {
        return etxtSellerName;
    }



















}
