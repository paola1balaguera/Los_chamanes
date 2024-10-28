/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author TheBestGroupOfTheChamans
 */
@Entity
public class Deuda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private float valor_cuota;
    private float valor_deuda;
    private Venta venta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getValor_cuota() {
        return valor_cuota;
    }

    public void setValor_cuota(float valor_cuota) {
        this.valor_cuota = valor_cuota;
    }

    public float getValor_deuda() {
        return valor_deuda;
    }

    public void setValor_deuda(float valor_deuda) {
        this.valor_deuda = valor_deuda;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
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
        if (!(object instanceof Deuda)) {
            return false;
        }
        Deuda other = (Deuda) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelos.Deuda[ id=" + id + " ]";
    }
    
}
