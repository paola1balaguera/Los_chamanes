/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Paola
 */
public class Cliente {
    private String cedula;
    private String nombreCompleto;
    private int celular;
    private String correoElectronico;
    private String direccionResidencia;
    private float ingresos;

    // Constructor
    public Cliente(String cedula, String nombreCompleto, int celular, String correoElectronico, String direccionResidencia, float ingresos) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.celular = celular;
        this.correoElectronico = correoElectronico;
        this.direccionResidencia = direccionResidencia;
        this.ingresos = ingresos;
    }

    public Cliente(String cedula, String nombreCompleto,int celular, String correoElectronico) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.celular = celular;
        this.correoElectronico = correoElectronico;    
    }

    // Métodos getter y setter
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public float getIngresos() {
        return ingresos;
    }

    public void setIngresos(float ingresos) {
        this.ingresos = ingresos;
    }

    // Método toString (opcional, para mostrar información de la clase)
    @Override
    public String toString() {
        return "Trabajador{" +
                "cedula='" + cedula + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", celular=" + celular +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", direccionResidencia='" + direccionResidencia + '\'' +
                ", ingresos=" + ingresos +
                '}';
    }
}
