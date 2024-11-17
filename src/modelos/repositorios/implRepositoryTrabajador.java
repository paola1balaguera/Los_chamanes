/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorios;

import factory.TrabajadorFactory;
import modelos.Rol;

/**
 *
 * @author Paola
 */
public class implRepositoryTrabajador implements IRepositoryTrabajador {
    private final TrabajadorFactory trabajadorFactory;

    public implRepositoryTrabajador(TrabajadorFactory trabajadorFactory) {
        this.trabajadorFactory = trabajadorFactory;
    }
    
    public boolean iniciar_sesion(String usuario, String password, int role) {
        return this.trabajadorFactory.login(usuario, password, role);
    }
    
}
