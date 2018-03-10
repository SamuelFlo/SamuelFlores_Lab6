package samuelflores_lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {

    private ArrayList<Producto> inventario = new ArrayList();
    private File archivo = null;

    public Inventario(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Producto> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Producto> inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "Inventario{" + "inventario=" + inventario + ", archivo=" + archivo + '}';
    }

    public void escribirArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Producto t : inventario) {
                if (t instanceof Comida) {
                    bw.write("comida" + ";");
                    bw.write(t.getNombre() + ";");
                    bw.write(t.getPreciocosto() + ";");
                    bw.write(t.getPreciodeventa() + ";");
                    bw.write(((Comida) t).getTipocomida() + ";");
                }else if(t instanceof Bebida){
                    bw.write("bebida" + ";");
                    bw.write(t.getNombre() + ";");
                    bw.write(t.getPreciocosto() + ";");
                    bw.write(t.getPreciodeventa() + ";");
                    bw.write(((Bebida) t).getEstado() + ";");
                    bw.write(((Bebida) t).getTamano() + ";");
                    bw.write(((Bebida) t).getTipo() + ";");
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

    /*public void escribirArchivob() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Producto t : inventario) {
                if (t instanceof Bebida) {
                    bw.write("bebida" + ";");
                    bw.write(t.getNombre() + ";");
                    bw.write(t.getPreciocosto() + ";");
                    bw.write(t.getPreciodeventa() + ";");
                    bw.write(((Bebida) t).getEstado() + ";");
                    bw.write(((Bebida) t).getTamano() + ";");
                    bw.write(((Bebida) t).getTipo() + ";");
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
    }*/

    public void cargarArchivo() {
        Scanner sc = null;
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);

                    
                    sc.useDelimiter(";");
                    while (sc.hasNext()) {
                        String identi;
                        identi = sc.next();

                        if (identi.equals("comida")) {
                            String nombre, tipodecomida;
                            double preciocosto, precioventa;
                            nombre = sc.next();
                            preciocosto = Double.parseDouble(sc.next());
                            precioventa = Double.parseDouble(sc.next());
                            tipodecomida = sc.next();
                            inventario.add(new Comida(tipodecomida, preciocosto, precioventa, nombre));
                        } else if (identi.equals("bebida")) {
                            String estado, tamano, tipo, nombre;
                            double preciocosto, preciodeventa;
                            nombre = sc.next();
                            preciocosto = Double.parseDouble(sc.next());
                            preciodeventa = Double.parseDouble(sc.next());
                            estado = sc.next();
                            tamano = sc.next();
                            tipo = sc.next();
                            
                            inventario.add(new Bebida(estado, tamano, tipo, preciocosto, preciodeventa, nombre));
                        }

                    }

            } catch (Exception e) {
                System.out.println("Ocurrio un error");
            }
            sc.close();
        }
    }


}
