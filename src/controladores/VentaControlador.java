/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.List;
import modelos.Venta;
import modelos.repositorios.VentaRepositoryImpl;

/**
 *
 * @author Paola
 */
public class VentaControlador {
    public List<Venta> listarVentas() {
        VentaRepositoryImpl ventaRepositorio = new VentaRepositoryImpl();
        
        return ventaRepositorio.listarVentas();
    }
}
