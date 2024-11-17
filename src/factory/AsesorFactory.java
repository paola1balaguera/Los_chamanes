/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import config.DatabaseAdministrador;
import config.DatabaseAsesor;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import modelos.Trabajador;

/**
 *
 * @author Paola
 */
public class AsesorFactory extends TrabajadorFactory {
    private final String funcionLoginSQL = "{? = CALL CHAMANES.INICIO_SESION(?, ?, ?)}";
    
    public boolean login(String usuario, String password, int role) {
        try (Connection connection = DatabaseAdministrador.init();
            CallableStatement callableStatement = connection.prepareCall(this.funcionLoginSQL)) {

            callableStatement.registerOutParameter(1, java.sql.Types.VARCHAR);
            
            callableStatement.setString(2, usuario);
            callableStatement.setString(3, password);
            callableStatement.setString(4, Integer.toString(2));
            
            callableStatement.execute();
            
            String nombreRol = callableStatement.getString(1);
            System.out.println(nombreRol);
            
            if (nombreRol == null) {
                return false;
            }
            
            System.out.println("El cliente inicio sesión correctamente en la base de datos.");
            return true;
        } catch (SQLException e) {
            System.err.println("Error al guardar el cliente en la base de datos: " + e.getMessage());
            return false;
        }
    }
}
