/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.repositorios;

import modelos.Database;
import java.sql.*;

/**
 *
 * @author Paola
 */
public class TrabajadorRepositoryImpl implements TrabajadorRepository {

    @Override
    public void listarTrabajadores() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void crearTrabajadorRol(String rol) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void editarTrabajadorRol(String rol) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void eliminarTrabajadorRol(int idTrabajador) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean iniciarSesion(int cedula, String contrasena, int role) {
        
        Connection connection = Database.init();
        String query = "SELECT * FROM TRABAJADOR WHERE CED_TRABAJADOR = ? AND CONTRASENA = ?";  
        
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, cedula);
            pstmt.setString(2, contrasena);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                String nombreCompleto = rs.getString("NOMBRE_COMPLETO");
                System.out.println(nombreCompleto);
                System.out.println("Inicio de sesión exitoso");
                return true;
            } else {
                System.out.println("Usuario o contraseña incorrectos.");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Database.close(connection);
        }
        return false;
    }
    
}
