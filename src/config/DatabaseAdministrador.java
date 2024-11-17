/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TheBestGroupOfTheChamans
 */
public class DatabaseAdministrador {
    //private static final String URL = "jdbc:mysql://localhost:3306/integrador";
    private static final String URL = "jdbc:oracle:thin:chamanAdministrador/chamanAdministrador@192.168.254.215:1521:orcl";
    private static final String USER = "chamanAdministrador";
    private static final String PASSWORD = "chamanAdministrador";
    
    public static Connection init() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return connection;
    }
    
    public static void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
