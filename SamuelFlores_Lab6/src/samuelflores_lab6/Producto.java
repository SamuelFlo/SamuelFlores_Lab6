package samuelflores_lab6;
public class Producto {
    private double preciocosto;
    private double preciodeventa;
    private String nombre;

    public Producto() {
    }

    public Producto(double preciocosto, double preciodeventa, String nombre) {
        this.preciocosto = preciocosto;
        this.preciodeventa = preciodeventa;
        this.nombre = nombre;
    }

    public double getPreciocosto() {
        return preciocosto;
    }

    public void setPreciocosto(double preciocosto) {
        this.preciocosto = preciocosto;
    }

    public double getPreciodeventa() {
        return preciodeventa;
    }

    public void setPreciodeventa(double preciodeventa) {
        this.preciodeventa = preciodeventa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" + "preciocosto=" + preciocosto + ", preciodeventa=" + preciodeventa + ", nombre=" + nombre + '}';
    }
    

}