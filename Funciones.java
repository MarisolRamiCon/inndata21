import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa el numero");
        int n1= entrada.nextInt();
        System.out.println("Ingresa el numero");
        int n2= entrada.nextInt();
        System.out.println(suma(n1, n2));
        //Cuando quiero usar un metodo 
        //Instancio la clase donde se declaro el metodo
        Funciones funcion = new Funciones();
        funcion.sumar();
        System.out.println(suma("Sumando varios numeros",5.8,8.5,9.5,3.8));
        entrada.close();
        
    }

    //Método static o función
    static int suma(int nu1, int nu2){
        return nu1+nu2;
    }

    static double suma(String mensaje, double... numeros){
        System.out.println(mensaje);
        double s=0;
        for(double num: numeros){
            s+=num;
        }
        return s;
    }

    //Método asociado a POO
    public void sumar(){
        System.out.println("Estamos sumando...");
    }
}
