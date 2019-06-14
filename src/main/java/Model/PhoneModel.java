package Model;

import entity.Phone;

import java.sql.*;
import java.util.ArrayList;

public class PhoneModel {
    Connection connection;

    public void insert(Phone phone) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/phoneinformation", "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO phone(name, brand, price, description) VALUES(?, ?, ?, ?)");
            preparedStatement.setString(1, phone.getName());
            preparedStatement.setString(2, phone.getBrand());
            preparedStatement.setInt(3, phone.getPrice());
            preparedStatement.setString(4, phone.getDescription());

            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
