/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuelflores_lab6;

/**
 *
 * @author Samuel
 */
public class Bebida extends Producto {
    private String estado;
    private String tamano;
    private String tipo;

    public Bebida() {
        super();
    }

    public Bebida(String estado, String tamano, String tipo, double preciocosto, double preciodeventa, String nombre) {
        super(preciocosto, preciodeventa, nombre);
        this.estado = estado;
        this.tamano = tamano;
        this.tipo = tipo;
    }

   

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bebida{" + "estado=" + estado + ", tamano=" + tamano + ", tipo=" + tipo + '}';
    }
    
    
}
