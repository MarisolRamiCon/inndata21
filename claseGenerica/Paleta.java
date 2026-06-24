package claseGenerica;

public class Paleta {
    private String marca;
    private Double precio;
    private String sabor;
    
    public Paleta(String marca, Double precio, String sabor) {
        this.marca = marca;
        this.precio = precio;
        this.sabor = sabor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    
    
}
