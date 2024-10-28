/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.List;
import modelos.Proyecto;
import modelos.Venta;
import modelos.repositorios.ProyectoRepositoryImpl;
import modelos.repositorios.VentaRepositoryImpl;

/**
 *
 * @author Paola
 */
public class ProyectoControlador {
    public List<Proyecto> listarProyectos() {
        ProyectoRepositoryImpl proyectoRepositorio = new ProyectoRepositoryImpl();
        
        return proyectoRepositorio.listarProyectos();
    }
}
