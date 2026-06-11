import java.util.*;
public class Edad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre");
        String nombre= entrada.nextLine();
        System.out.println("¿Cuál es tu porcentaje de asistencia?");
        int asistencia= entrada.nextInt();
        System.out.println("¿Cual es tu calificación en un rango de 0 a 100");
        double calificación= entrada.nextDouble();
        if(asistencia>75 && calificación>=80){
            System.out.println("Pasaste el diplomado");
        }else{
            System.out.println("No cumpliste los requisitos. No pasas el diplomado.");
        }
        

    }
}
