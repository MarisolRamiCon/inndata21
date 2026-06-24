package claseGenerica;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Bolsa <Paleta> bolsaDePaletas= new Bolsa<>();
        bolsaDePaletas.add(new Paleta("Tutsi", 10.0, "fresa"));
        bolsaDePaletas.add(new Paleta("Vero", 20.0, "tarrito" ));
        Bolsa<Soda> bolsaDeSodas = new Bolsa<>();
        bolsaDeSodas.add(new Soda("Coca", "coca"));
        bolsaDeSodas.add(new Soda("Jarrito", "Tamarindo"));

        System.out.println(bolsaDePaletas.getLista().stream().map(paleta->
            "\nPrecio: "+ paleta.getPrecio()+" \n Marca: "+ paleta.getMarca()+"\nSabor: "+ 
            paleta.getSabor()).toList());
        System.out.println(
        bolsaDeSodas.getLista().stream().map(soda -> "Marca: "+ soda.getMarca()+
        " Sabor: " +soda.getSabor()).toList());

        bolsaDeSodas.getLista().stream().forEach(soda ->
        {
            System.out.println("Marca "+ soda.getMarca());
            System.out.println("Sabor "+soda.getSabor());
        }
        );
        
    }
}
