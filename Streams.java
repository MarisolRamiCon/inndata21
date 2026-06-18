import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Streams {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        List <String> personas= new ArrayList<>();
        personas.add("Guadalupe");
        personas.add("Oscar");
        personas.add("Genaro");
        personas.add("Augusto");
        System.out.println(personas);
        //Filtrar los nombres que empiezan con G
        //streams
        System.out.println("Ingresa la letra por la que quieres filtrar el listado");
        String letra= entrada.nextLine();
        List<String> personasConG = personas.stream().filter(nombre->nombre.contains(letra)).toList();
        System.out.println(personasConG);
        System.out.println(personas.stream().map(n-> n.toUpperCase()).toList());
        //Lista ordenada
        System.out.println(personas.stream().sorted().toList());

    }
    
}
