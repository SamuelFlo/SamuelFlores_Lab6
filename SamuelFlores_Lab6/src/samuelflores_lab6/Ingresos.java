/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuelflores_lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Samuel
 */
public class Ingresos {
    private ArrayList<Ventas> ing = new ArrayList();
    private File archivo = null;

    public Ingresos() {
    }

    public ArrayList<Ventas> getIng() {
        return ing;
    }

    public void setIng(ArrayList<Ventas> ing) {
        this.ing = ing;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }


    @Override
    public String toString() {
        return "Ingresos{" + "ing=" + ing +  '}';
    }
    public void escribirArchivo(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo= new File("./Ingresos");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Ventas t : ing) {
                if (t instanceof Ventas) {
                    bw.write("Fecha de venta: "+t.getFechadelaventa());
                    bw.newLine();
                    bw.write("Total de ventas: "+t.getTotaldeventas());
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
