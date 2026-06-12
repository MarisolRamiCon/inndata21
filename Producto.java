public class Producto{
    //Atributos de ese producto o caracteristicas
    private Integer id;
    private String nombre;
    private String descripcion;
    //Metodo constructor
    public Producto(int id, String nombre, String descripcion){
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
    }

    public Producto(){

    }

    //Getter y Setter
    //getter
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }

}