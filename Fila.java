import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue <String> filaTortillas= new PriorityQueue<>();
        filaTortillas.add("Carolina");
        filaTortillas.offer("Itzel");
        filaTortillas.offer("Gustavo");
        System.out.println(filaTortillas); //"Carolina", "Gustavo", "Itzel"
        while (!filaTortillas.isEmpty()) {
            System.out.println("El siguiente en ser atendido es: "+ filaTortillas.peek());
            filaTortillas.poll();
        }
        System.out.println(filaTortillas.poll());

        Queue <Integer> id= new PriorityQueue<>();
        id.add(30);
        id.add(3);
        id.add(50);
        System.out.println(id);

    }
    
}
