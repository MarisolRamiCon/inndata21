package POO;

public class Principal {
    public static void main(String[] args) {
        //Instanciar la clase Gato
       /*  Gato gatito= new Gato("Silver",4,"negro", "macho", "mestizo");
        gatito.trepar();
        gatito.emitirSonido();
        //Instanciar la clase Perro
        Perro miPerro = new Perro("Polvoron", 4);
        miPerro.emitirSonido();*/

        Calculadora miCalculadora= new Calculadora("Casio", 300.0);
        System.out.println(miCalculadora.sumar(2.5,3.8,1.5));

    }
}
