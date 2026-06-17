import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("""
                1) Lecturas
                2) Peliculas
                3) Museos
                """);
        System.out.println("Selecciona una opción:");
        String opcion = entrada.next();
                switch(opcion.toLowerCase()){
                    case "a":
                        System.out.println("Has seleccionado Lecturas");
                        break;
                    case "b":
                        System.out.println("Has seleccionado Peliculas");
                        break;
                    case "c":
                        System.out.println("Has seleccionado Museos");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }

            entrada.close();
    }
    
}
