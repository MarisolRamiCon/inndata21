package POO;

public class Tortuga implements Maritimo, Terrestre  {

    @Override
    public void caminar() {
       System.out.println("La tortuga camina");
    }

    @Override
    public void nadar() {
        System.out.println("La tortuga nada");
    }
    
}
