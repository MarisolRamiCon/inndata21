import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alumnos {
    public static void main(String[] args) {
        String nombre;
        Scanner entrada= new Scanner(System.in);
        //Hemos declarado una lista vacia
        List <String> alumnos = new ArrayList<>();
        System.out.println("Cuantos alumnos quieres agregar");
        int numeroAlumnos= entrada.nextInt();
        entrada.nextLine();
        for(int i=0; i<numeroAlumnos; i++){ 
            System.out.println("¿Cuál es el nombre?");
            nombre= entrada.nextLine();
            alumnos.add(nombre);   
        }
        System.out.println(alumnos);
        alumnos.add(0, "Fabian");
        System.out.println(alumnos);//Fabian,Ivan, Kalem, Hugo
        //System.out.println("El nombre en el indice 2 es "+ alumnos.get(2));//Kalem
        for(String name:alumnos){
            System.out.println(name.toUpperCase() );
        }
    }
    

    
}
