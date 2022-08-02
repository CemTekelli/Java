package com.javacourse;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:mysql//127.0.0.1:3306/employees_database";
        try {
            // Establish connection object
            Connection connection = DriverManager.getConnection(url, "root", "cem98");
            //create a statement object to send the database
            Statement statement = connection.createStatement();
            //execute the statement object
            ResultSet resultSet = statement.executeQuery("select * from employees_tbl");

            // Process the result
            while(resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
