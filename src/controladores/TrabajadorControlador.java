/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import modelos.repositorios.TrabajadorRepositoryImpl;

/**
 *
 * @author Paola
 */
public class TrabajadorControlador {
    
    public boolean iniciarSesion(int cedula, String password, int role) {
        TrabajadorRepositoryImpl trabajadorRepositorio = new TrabajadorRepositoryImpl();
        
        return trabajadorRepositorio.iniciarSesion(cedula, password, role);
    }
    
}
