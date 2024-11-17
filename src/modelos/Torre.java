/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Paola
 */
import java.util.Date;

public class Torre {
    private String codigo;
    private Date fechaConstruccion;

    // Constructor
    public Torre(String codigo, Date fechaConstruccion) {
        this.codigo = codigo;
        this.fechaConstruccion = fechaConstruccion;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public Date getFechaConstruccion() {
        return fechaConstruccion;
    }

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFechaConstruccion(Date fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    // Método toString (opcional, para imprimir detalles de la clase)
    @Override
    public String toString() {
        return "Torre{" +
               "codigo='" + codigo + '\'' +
               ", fechaConstruccion=" + fechaConstruccion +
               '}';
    }
}

