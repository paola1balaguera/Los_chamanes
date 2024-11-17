/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import javax.management.relation.Role;
import modelos.Trabajador;

/**
 *
 * @author Paola
 */
public abstract class TrabajadorFactory {
        public abstract boolean login(String usuario, String password, int role);
}
