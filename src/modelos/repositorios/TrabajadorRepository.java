/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.repositorios;

/**
 *
 * @author Paola
 */
public interface TrabajadorRepository {
    void listarTrabajadores();  // Método abstracto
    void crearTrabajadorRol(String rol);
    void editarTrabajadorRol(String rol);
    void eliminarTrabajadorRol(int idTrabajador);
    boolean iniciarSesion(int cedula, String contrasena, int role);
}
