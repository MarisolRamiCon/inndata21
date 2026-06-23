package POO;

public class Gato extends Animal {
    //Atributos
    private String nombre;
    private Integer edad;
    private String color;
    private String genero;
    private String raza;

    //Metodo constructor (nos permite inicializar los atributos de la clase)
    public Gato(String nombre, Integer edad,String color, String genero, String raza){
        super(nombre, edad);
        this.color=color;
        this.genero=genero;
        this.raza=raza;

    }

    //Getter son aquellos con los que obtenemos el valor guardado en el atributo
    public String getColor(){
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGenero() {
        return genero;
    }
    

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    //Métodos
    @Override
    public void emitirSonido(){
        System.out.println("Estoy maullando");
    }

    public void trepar(){
        System.out.println("Estoy trepando");
    }

    public void comer(){
        System.out.println("Estoy comiento croquetas");
    }
    
}
