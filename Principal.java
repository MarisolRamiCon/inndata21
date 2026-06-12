
public class Principal {
    public static void main(String[] args) {
        Producto jabon= new Producto(1, "JABON DE BAÑO", "OLOR A LAVANDA");
        jabon.setId(3);
        System.out.println(jabon.getId());
        Producto shampoo= new Producto();
        shampoo.setId(2);
    }
    
    
}
