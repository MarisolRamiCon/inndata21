import java.util.Scanner;

public class Compras{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precio=0;
        System.out.println("¿Cuantos articulos vas a comprar?");
        int numeroArticulos = entrada.nextInt();
        for(int i=1; i<=numeroArticulos;i++){
            System.out.println("¿Cuanto cuesta el articulo "+ i +" ?");
            precio+= entrada.nextDouble();
           //suma+=precio;
        }
        System.out.println("El total a pagar es "+ precio +"$");
        entrada.close();
    }
}