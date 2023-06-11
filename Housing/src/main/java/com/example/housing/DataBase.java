package com.example.housing;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class DataBase {
    public void signUp(Person person) throws SQLException {
        String firstName = person.getFirstName();
        String lastName = person.getLastName();
        String Id = person.getId();
        String password = person.getPassword();
        java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Housing", "root", "");
        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO person (firstName , lastName , Id , password) VALUES  ('" + firstName + "' , '" + lastName + "' , '" + Id + "' , '" + password+ "');");
        connection.close();
        statement.close();
    }
    public void entryGrounds(String type, String ID, String area, String price, String sellerName, String address, String pos) throws SQLException {
        java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Housing", "root", "");
        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO gandh (ID , type , area , price , sellerName , address , possibilities ) VALUES ( '" + ID + "','" + type + "' , '" + area + "', '" + price + "','" + sellerName + "','" + address + "' , '" + pos + "');");
        connection.close();
        statement.close();
    }
    public void update(String type, String id, String area, String price, String name, String address, String pos) throws SQLException {
        java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Housing", "root", "");
        Statement statement = connection.createStatement();
        String sql = "UPDATE  gandh SET";
        if (!area.isEmpty()) {
            sql += " area='" + area + "',";
        }
        if (!price.isEmpty()) {
            sql += " price='" + price + "',";
        }
        if (!name.isEmpty()) {
            sql += " sellerName='" + name + "',";
        }
        if (!address.isEmpty()) {
            sql += " address='" + address + "',";
        }
        if (!pos.isEmpty()) {
            sql += " possibilities='" + pos + "',";
        }
        sql = sql.substring(0, sql.length() - 1);
        sql += " WHERE ID='" + id + "'AND type = '" + type + "'";
        statement.executeUpdate(sql);
        connection.close();
        statement.close();
    }
public void delete(String ID, String type) throws SQLException {
    java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Housing", "root", "");
    Statement statement = connection.createStatement();
    statement.executeUpdate("DELETE FROM gandh WHERE ID='"+ID+"' AND type = '" + type + "'");
    connection.close();
    statement.close();
}
public void transactionEnter(String type, String buyer, String seller, String price, String meli, String father, String ID, LocalDate cal) throws SQLException {
    java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Housing", "root", "");
    Statement statement = connection.createStatement();
    statement.executeUpdate("INSERT INTO transaction (type , buyerName , sellerName , finalPrice , meliCode , fatherName , housingID , calender) VALUES ('" + type + "','" + buyer + "' , '" + seller + "','" + price + "','" + meli + "','" + father + "','" + ID + "','" + cal+ "');");
    connection.close();
    statement.close();
}


}
















