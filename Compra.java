import java.util.Scanner;

public class Compra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //vamos a tener un dinero inicial de 2000 pesos 
        System.out.println("¿Cuanto dinero tienes para gastar?");
        double dinero=entrada.nextDouble();
        do{
            System.out.println("¿Cuánto cuesta el articulo que quieres comprar?");
            double precio= entrada.nextDouble();
            if(precio>dinero){
                System.out.println("No tienes suficiente dinero para comprar este articulo");
            }else{
                dinero-=precio;
                System.out.println("Has comprado el articulo por "+ precio +"$");
                System.out.println("Te queda un total de "+ dinero +"$");
            }
        }while (dinero>0);
        entrada.close();
    }
}
