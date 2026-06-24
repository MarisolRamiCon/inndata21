package claseGenerica;

public class Soda {
    private String marca;
    private String sabor;
    public Soda(String marca, String sabor) {
        this.marca = marca;
        this.sabor = sabor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    
}
