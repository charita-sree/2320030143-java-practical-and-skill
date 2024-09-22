package com.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) {
		  String url = "jdbc:mysql://localhost:3306/mydatabase";
	        String user = "root";
	        String password = "password";

	        // JDBC variables for opening, managing connection
	        Connection connection = null;
	        Statement statement = null;
	        ResultSet resultSet = null;

	        try {
	            // Open a connection
	            connection = DriverManager.getConnection(url, user, password);

	            // Create a statement
	            statement = connection.createStatement();

	            // Execute a query
	            String sql = "SELECT * FROM fruits";
	            resultSet = statement.executeQuery(sql);

	            // Process the result set
	            while (resultSet.next()) {
	                String fruitName = resultSet.getString("name");
	                System.out.println("Fruit: " + fruitName);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            // Clean up the environment
	            try {
	                if (resultSet != null) resultSet.close();
	                if (statement != null) statement.close();
	                if (connection != null) connection.close();
	            } catch (SQLException se) {
	                se.printStackTrace();
	            }
	        }
	    }
		// TODO Auto-generated method stub

	}


