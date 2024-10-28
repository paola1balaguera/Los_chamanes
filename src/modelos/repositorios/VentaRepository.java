/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.repositorios;

import java.util.List;
import modelos.Venta;

/**
 *
 * @author Paola
 */
public interface VentaRepository {
    List<Venta> listarVentas();
    void crearVentas();
    void editarVentas();
}
