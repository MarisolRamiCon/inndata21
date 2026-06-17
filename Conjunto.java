import java.util.TreeSet;

public class Conjunto {
    public static void main(String[] args) {
        TreeSet <String> nombres= new TreeSet<>();
        nombres.add("Esmeralda");
        nombres.add("Diego");
        nombres.add("arturo");
        nombres.add("Mario");
        System.out.println(nombres);
        System.out.println("El tamaño del conjunto nombres es: "+nombres.size());
        nombres.clear();
        System.out.println(nombres);
        nombres.add("Gustavo");
        for(String n: nombres){
            System.out.println(n);
        }
    }
}
