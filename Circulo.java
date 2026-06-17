public class Circulo implements Figura{
    int x,y; 
    double radio;
    public Circulo(int x, int y, int radio){
        this.x=x;
        this.y=y;
        this.radio= radio;
    }

    public double calcularArea(){
        return Math.PI*Math.pow(radio, 2);

    }
    public double calcularPerimetro(){
        return 2*Math.PI*radio;

    }
}