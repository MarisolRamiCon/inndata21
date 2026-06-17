import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Calificaciones {
    public static void main(String[] args) {
        Map <String, Double> listaCalificaciones = new LinkedHashMap<>();
        
        listaCalificaciones.put("Jimena", 8.3);
        listaCalificaciones.put("Raul", 9.4);
        listaCalificaciones.put("Pancha", 7.5);
        listaCalificaciones.put("Andrea", 9.5);
        System.out.println(listaCalificaciones);
        for(String nombre: listaCalificaciones.keySet()){
            System.out.println("La calificacion de "+nombre+" es "+ listaCalificaciones.get(nombre));
        }
        listaCalificaciones.replace("Angelica",9.5);
        System.out.println(listaCalificaciones);


    }
    
    
}
