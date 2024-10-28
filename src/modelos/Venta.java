/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author TheBestGroupOfTheChamans
 */
@Entity
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private boolean metodo_pago;
    private float precio_total;
    private Date fec_venta;
    private float porcentaje_interes;
    private int cant_cuotas;
    private float valor_subsidio;
    private Cliente cliente;
    private Trabajador asesor;

    public Venta(String id, boolean metodo_pago, float precio_total, Date fec_venta) {
        this.id = id;
        this.metodo_pago = metodo_pago;
        this.precio_total = precio_total;
        this.fec_venta = fec_venta;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(boolean metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public float getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(float precio_total) {
        this.precio_total = precio_total;
    }

    public Date getFec_venta() {
        return fec_venta;
    }

    public void setFec_venta(Date fec_venta) {
        this.fec_venta = fec_venta;
    }

    public float getPorcentaje_interes() {
        return porcentaje_interes;
    }

    public void setPorcentaje_interes(float porcentaje_interes) {
        this.porcentaje_interes = porcentaje_interes;
    }

    public int getCant_cuotas() {
        return cant_cuotas;
    }

    public void setCant_cuotas(int cant_cuotas) {
        this.cant_cuotas = cant_cuotas;
    }

    public float getValor_subsidio() {
        return valor_subsidio;
    }

    public void setValor_subsidio(float valor_subsidio) {
        this.valor_subsidio = valor_subsidio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Trabajador getAsesor() {
        return asesor;
    }

    public void setAsesor(Trabajador asesor) {
        this.asesor = asesor;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelos.Venta[ id=" + id + " ]";
    }
    
}
