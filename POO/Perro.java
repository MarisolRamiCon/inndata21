package POO;

public class Perro extends Animal {

    public Perro(String nombre, Integer edad){
        super(nombre,edad);
    }

    @Override
    public void emitirSonido(){
        System.out.println(getNombre() +"  esta ladrando");
    }
 
    @Override
    public void comer(){
        System.out.println("El gato come croquetas");
    }
   
}
