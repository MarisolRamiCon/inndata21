package POO;

public class Calculadora {
    private String marca;
    private Double precio;

    public Calculadora(String marca, Double precio) {
        this.marca = marca;
        this.precio = precio;
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
    //Sobrecargar un mismo metodo
    public void sumar(){
        System.out.println("Estoy sumando");
    }
    
    public int sumar(int a, int b){
        return a+b;
    }

    public double sumar(double a, double b){
        return a+b;
    }

    public void sumar(int a, double b){
        System.out.println("Estoy sumando "+a+" y "+b );
    }

    public double sumar(double... numeros){
        double s=0;
        for(double n: numeros){
            s+=n;//s=s+n
        }
        return s;
    }
    
    
}
