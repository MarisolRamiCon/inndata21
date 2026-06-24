package claseGenerica;

import java.util.ArrayList;
import java.util.List;

public class Bolsa<T>{
    List<T> bolsa= new ArrayList<>();

    //metodos que ya existen en arrayList
    public void add(T objeto){
        bolsa.add(objeto);
    }

    public List<T> getLista(){
        return bolsa;
    }
}
