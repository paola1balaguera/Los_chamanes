/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos;

/**
 *
 * @author Paola
 */
public interface Trabajador {
    int getCedula();
    void setCedula(int cedula);

    String getNombreCompleto();
    void setNombreCompleto(String nombreCompleto);

    int getCelular();
    void setCelular(int celular);

    String getCorreoElectronico();
    void setCorreoElectronico(String correoElectronico);

    String getDireccionResidencia();
    void setDireccionResidencia(String direccionResidencia);

    String getContrasena();
    void setContrasena(String contrasena);

    boolean isEstado();
    void setEstado(boolean estado);
}
