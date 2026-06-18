import java.util.InputMismatchException;
import java.util.Scanner;

public class Errores {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        try{
           
            System.out.println("Ingresa un numero");
            int numero= entrada.nextInt();
            
            System.out.println("¿Cual es tu edad");
            int edad=entrada.nextInt();
            if(edad>=0 && edad<=120){
                if(edad>=18){
                    System.out.println("Es mayor de edad");
                }else{
                    System.out.println("Es menor de edad");
                }
            }else{
                throw new RuntimeException("No es una edad valida");
            
            }
         }catch(InputMismatchException e ){
            System.out.println("Ingresa solo numeros");
        }catch(Exception e){
            System.out.println("Error "+ e);
        }
        finally{
            System.out.println("Fin del programa. Nos vemos luego");
        }
        
    }
    
}
