/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.repositorios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelos.Database;
import modelos.Proyecto;
import modelos.Venta;

/**
 *
 * @author Paola
 */
public class ProyectoRepositoryImpl implements ProyectoRepository{

    @Override
    public List<Proyecto> listarProyectos() {
        List<Proyecto> proyectos = new ArrayList<>();
        String sql = "SELECT * FROM proyecto";
        
        try (Connection conn = Database.init();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println(rs);
            while (rs.next()) {
                Proyecto proyecto = new Proyecto(rs.getString("CODIGO_PROYECTO"), rs.getString("NOMBRE"), rs.getString("DIRECCION"));
                proyectos.add(proyecto);
            }
        } catch (SQLException ex) {
            System.out.println("se daño");
        }
        return proyectos;
    }
    
}
