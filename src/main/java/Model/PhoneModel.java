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

    public ArrayList<Phone> getList(String sql) {
        ArrayList<Phone> phones = new ArrayList<>();
        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/phoneinformation", "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int eId = resultSet.getInt(1);
                String eName = resultSet.getString(2);
                String eBrand = resultSet.getString(3);
                int ePrice = resultSet.getInt(4);
                String eDescription = resultSet.getString(5);
                Phone phone = new Phone();
                phone.setID(eId);
                phone.setName(eName);
                phone.setName(eBrand);
                phone.setPrice(ePrice);
                phone.setDescription(eDescription);
                phones.add(phone);
            }
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return phones;
    }
}
