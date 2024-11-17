/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import modelos.Rol;
import repositorios.IRepositoryTrabajador;
import repositorios.implRepositoryTrabajador;

/**
 *
 * @author Paola
 */
public class TrabajadorController {
    private final IRepositoryTrabajador implRepositoryTrabajador;
    
    public TrabajadorController(IRepositoryTrabajador implRepositoryTrabajador) {
        this.implRepositoryTrabajador = implRepositoryTrabajador;
    }
    
    public boolean iniciar_sesion(String usuario, String password, int role) {
        return implRepositoryTrabajador.iniciar_sesion(usuario, password, role);
    }
}
