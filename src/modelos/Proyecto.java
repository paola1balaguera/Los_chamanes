/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Paola
 */
public class Proyecto {
    private String codigo;
    private String nombre_proyecto;
    private String direccion;

    public Proyecto(String codigo, String nombre_proyecto, String direccion) {
        this.codigo = codigo;
        this.nombre_proyecto = nombre_proyecto;
        this.direccion = direccion;
    }
    
    public Proyecto(String nombre_proyecto, String direccion) {
        this.nombre_proyecto = nombre_proyecto;
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre_proyecto() {
        return nombre_proyecto;
    }

    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
