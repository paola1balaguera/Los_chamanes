/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorios;

import modelos.Rol;

/**
 *
 * @author Paola
 */
public interface IRepositoryTrabajador {
    public boolean iniciar_sesion(String usuario, String password, int role);
}
