import java.util.*;
public class Nombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String [] nombres = new String[6];
        for(int i=0; i<nombres.length;i++){
            System.out.println("¿Cuál es el nombre   "+ (i+1) +" ?");
            nombres[i]= entrada.nextLine();
        }
        
        for(String name: nombres){
            System.out.print(name + "  ");
        }
        entrada.close();
        /*
        ernesto, carolina, berenice, alejandro, mario, hugo */
    }
}
