package samuelflores_lab6;
public class Comida extends Producto{
    private String tipocomida;

    public Comida() {
        super();
    }

    public Comida(String tipocomida, double preciocosto, double preciodeventa, String nombre) {
        super(preciocosto, preciodeventa, nombre);
        this.tipocomida = tipocomida;
    }

    

    public String getTipocomida() {
        return tipocomida;
    }

    public void setTipocomida(String tipocomida) {
        this.tipocomida = tipocomida;
    }

    @Override
    public String toString() {
        return "Comida{" + "tipocomida=" + tipocomida + '}';
    }
    
    
    
}
