/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorios;

import config.DatabaseAdministrador;
import java.util.ArrayList;
import java.util.List;
import modelos.Proyecto;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paola
 */
public class implRepositoryProyecto implements IRepositoryCompletoT {
    
    private final String procedimientoCrearSQL = "{CALL chamanes.p_guardar_proyecto(?, ?)}";
    private final String procedimientoModificarSQL = "{CALL chamanes.p_modificar_proyecto(?, ?, ?)}";
    private final String procedimientoEliminarSQL = "{CALL chamanes.p_eliminar_proyecto(?)}";
    ArrayList<Proyecto> listaDeProyectos = new ArrayList<>();

    @Override
    public void crear(Object objeto) {
        Proyecto proyecto = (Proyecto) objeto; 
        
        try (Connection connection = DatabaseAdministrador.init();
            CallableStatement callableStatement = connection.prepareCall(this.procedimientoCrearSQL)) {

            connection.setAutoCommit(false);
            
            callableStatement.setString(1, proyecto.getDireccion());  
            callableStatement.setString(2, proyecto.getNombre_proyecto()); 

            callableStatement.execute();
            connection.commit();
            System.out.println("El cliente se guardó correctamente en la base de datos.");

        } catch (SQLException e) {
            System.err.println("Error al guardar el cliente en la base de datos: " + e.getMessage());
        }
        
    }

    @Override
    public List<Proyecto> listar() {
        
        List<Proyecto> proyectos = new ArrayList<>();
        String sql = "SELECT codigo_proyecto, nombre, direccion FROM chamanes.proyecto";

        try (Connection connection = DatabaseAdministrador.init();
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Proyecto p = new Proyecto(rs.getString("codigo_proyecto"), rs.getString("nombre"), rs.getString("direccion"));
                proyectos.add(p);
            }
            System.out.println("entro");
            System.out.println(proyectos);
            return proyectos;
        } catch (SQLException ex) {
            System.err.println("Error al listar proyectos: " + ex.getMessage());
            ex.printStackTrace();
        }

        return null;
    }

    @Override
    public void editar(String id, Object objeto) {
        Proyecto proyecto = (Proyecto) objeto; 
        
        try (Connection connection = DatabaseAdministrador.init();
            CallableStatement callableStatement = connection.prepareCall(this.procedimientoModificarSQL)) {

            connection.setAutoCommit(false);
            
            callableStatement.setString(1, id);  
            callableStatement.setString(2, proyecto.getNombre_proyecto());
            callableStatement.setString(3, proyecto.getDireccion());

            callableStatement.execute();
            connection.commit();
            System.out.println("El proyecto se actualizo correctamente en la base de datos.");

        } catch (SQLException e) {
            System.err.println("Error al actualizo el proyecto en la base de datos: " + e.getMessage());
        }
    }

    @Override
    public void eliminar(String id) {        
        try (Connection connection = DatabaseAdministrador.init();
            CallableStatement callableStatement = connection.prepareCall(this.procedimientoEliminarSQL)) {

            connection.setAutoCommit(false);
            
            callableStatement.setString(1, id);  

            callableStatement.execute();
            connection.commit();
            System.out.println("El proyecto se elimino correctamente en la base de datos.");

        } catch (SQLException e) {
            System.err.println("Error al proyecto el cliente en la base de datos: " + e.getMessage());
        }
    }

    /**
     *
     * @return
     */

      
    
}
