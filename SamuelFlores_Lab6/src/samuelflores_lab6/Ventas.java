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
public class Ventas {
    private double totaldeventas;
    private String fechadelaventa;

    public Ventas() {
    }

    public Ventas(double totaldeventas, String fechadelaventa) {
        this.totaldeventas = totaldeventas;
        this.fechadelaventa = fechadelaventa;
    }

    public double getTotaldeventas() {
        return totaldeventas;
    }

    public void setTotaldeventas(double totaldeventas) {
        this.totaldeventas = totaldeventas;
    }

    public String getFechadelaventa() {
        return fechadelaventa;
    }

    public void setFechadelaventa(String fechadelaventa) {
        this.fechadelaventa = fechadelaventa;
    }
    

    @Override
    public String toString() {
        return "Ventas{" + "totaldeventas=" + totaldeventas + ", fechadelaventa=" + fechadelaventa + '}';
    }
    
    
}
