/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Paola
 */
public class Administrador implements Trabajador {
    private int cedula;
    private String nombreCompleto;
    private int celular;
    private String correoElectronico;
    private String direccionResidencia;
    private String contrasena;
    private boolean estado;

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    
    public int getCedula() {
        return cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getCelular() {
        return celular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public String getContrasena() {
        return contrasena;
    }

    public boolean isEstado() {
        return estado;
    }    
}
