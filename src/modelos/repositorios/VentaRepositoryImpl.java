/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.repositorios;

import java.util.ArrayList;
import java.util.List;
import modelos.Venta;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Database;

/**
 *
 * @author Paola
 */
public class VentaRepositoryImpl implements VentaRepository {

    public List<Venta> listarVentas() {
        List<Venta> ventas = new ArrayList<>();
        String sql = "SELECT * FROM venta";
        
        try (Connection conn = Database.init();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("hola");
            System.out.println(rs);
            while (rs.next()) {
                Venta venta = new Venta(rs.getString("ID_VENTA"), rs.getBoolean("METODO_PAGO"), rs.getFloat("PRECIO_TOTAL"), rs.getDate("FECHA_VENTA"));
                ventas.add(venta);
            }
        } catch (SQLException ex) {
            System.out.println("se daño");
        }
        return ventas;
    }

    @Override
    public void crearVentas() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void editarVentas() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
