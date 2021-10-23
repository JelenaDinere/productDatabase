package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBHandler {
    String connectionUrl = "jdbc:mysql://localhost:3306/shop";
String user = "root";
String pass = "Qwerty123456";

    private static Connection connection;
    public DBHandler(){
        try {
            connection = DriverManager.getConnection(connectionUrl, user, pass);
            System.out.println("Connection database successfull");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error connecting to database");
        }

    }
    public static Connection getConnection(){
        return connection;
    }

//    public static void main(String[] args) {
//        String connectionUrl = "jdbc:mysql://localhost:3306/shop";
//        String user = "root";
//        String pass = "Qwerty123456";
        //To make products table in database;
//        Connection connection;
//        try {
//            connection = DriverManager.getConnection(connectionUrl, user, pass);
//            String query = "CREATE TABLE products (id int primary key auto_increment," +
//                    "name VARCHAR(30) NOT NULL," +
//                    "price FLOAT NOT NULL," +
//                    "quantity INT NOT NULL," +
//                    "description VARCHAR(50))";
//            PreparedStatement statement = connection.prepareStatement(query);
//            statement.execute();
//            System.out.println("Connection database successfull");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("Error connecting to database");
//        }
//    }
}
