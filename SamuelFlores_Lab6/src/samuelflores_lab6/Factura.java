package samuelflores_lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Factura {
    private ArrayList<Producto>inven = new ArrayList();
    private String correo;
    private String nombre;
    private String RTN;
    private String CAI;
    private String fecha;
    private File archivo = null;

    public Factura() {
    }

    public Factura(String correo, String nombre, String RTN, String CAI, String fecha) {
        this.correo = correo;
        this.nombre = nombre;
        this.RTN = RTN;
        this.CAI = CAI;
        this.fecha = fecha;
    }

    public ArrayList<Producto> getInven() {
        return inven;
    }

    public void setInven(ArrayList<Producto> inven) {
        this.inven = inven;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRTN() {
        return RTN;
    }

    public void setRTN(String RTN) {
        this.RTN = RTN;
    }

    public String getCAI() {
        return CAI;
    }

    public void setCAI(String CAI) {
        this.CAI = CAI;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Factura{" + "inven=" + inven + ", correo=" + correo + ", nombre=" + nombre + ", RTN=" + RTN + ", CAI=" + CAI + ", fecha=" + fecha + '}';
    }
    public void escribirArchivo(Inventario n) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("./Factura");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
                bw.write("CAI: "+CAI);
                bw.newLine();
                bw.write("RTN: "+RTN);
                bw.newLine();
                bw.write("Fecha: "+fecha);
                bw.newLine();
                bw.write("Correo: "+correo);
                bw.newLine();
                bw.write("Nombre: "+nombre);
                bw.newLine();
                
            for (Producto t : n.getInventario()) {
                if (t instanceof Comida) {
                    bw.write("Productos" + ";");
                    bw.newLine();
                    bw.write("Nombre: "+t.getNombre() + " ");
                    bw.write("Precio de venta: "+t.getPreciodeventa() + " ");
                    bw.newLine();
                }else if(t instanceof Bebida){
                    bw.write("Producto" + ";");
                    bw.newLine();
                    bw.write("Nombre: "+t.getNombre() + " ");
                    bw.write("Precio de venta: "+t.getPreciodeventa() + " ");
                    bw.newLine();
                    
                }

            }
            bw.flush();
        } catch (Exception e) {
        }
        try {
            bw.close();
            fw.close();
        } catch (IOException ex) {
        }
    }

    
}
