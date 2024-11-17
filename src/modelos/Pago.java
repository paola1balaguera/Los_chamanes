package modelos;

import java.util.Date;

public class Pago {
    private int id;                 // Identificador único del pago
    private TipoPago tipo;          // Tipo de pago (Crédito o Contado)
    private float valor;            // Valor del pago
    private Date fechaPago;         // Fecha en que se realizó el pago

    // Enumerado para definir los tipos de pago
    public enum TipoPago {
        CREDITO,  // Representa pagos a crédito
        CONTADO   // Representa pagos al contado
    }

    // Constructor
    public Pago(int id, TipoPago tipo, float valor, Date fechaPago) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.fechaPago = fechaPago;
    }

    // Getters
    public int getId() {
        return id;
    }

    public TipoPago getTipo() {
        return tipo;
    }

    public float getValor() {
        return valor;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(TipoPago tipo) {
        this.tipo = tipo;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    // Método toString para representar el objeto en formato legible
    @Override
    public String toString() {
        return "Pago{" +
               "id=" + id +
               ", tipo=" + tipo +
               ", valor=" + valor +
               ", fechaPago=" + fechaPago +
               '}';
    }
}