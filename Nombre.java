public class Nombre{
    public static void main(String[] args) {
        String nombre="Berenice";
        System.out.println(nombre.toUpperCase()); //mayusculas
        Character letra='C';
        System.out.println(letra.charValue());
        /*tipos de datos primitivos estan con minuscula 
        Los estructurados estan con mayuscula
        Los wrapper estan con mayuscula porque son objetos*/
        for(int i=0; i<=3;i++){
            System.out.println(nombre);
        }

        double numero=5;
        System.out.println(numero--); //5
        System.out.println(numero); //4
        /*System.out.println(Math.pow(numero,2));
        double op5=6*5/9.0+6;
        System.out.println(op5);*/
        
    }
}