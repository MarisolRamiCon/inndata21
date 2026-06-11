import java.util.Scanner;

public class Ternario {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("¿Cuál es tu calificacion?");
        double calificacion= sc.nextDouble();
        String respuesta= (calificacion>=60)?"Aprobaste":"No aprobaste";
        System.out.println(respuesta);
        sc.close();
    }
}
