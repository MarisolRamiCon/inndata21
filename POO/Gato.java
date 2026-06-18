package POO;

public class Gato {
    //Atributos
    private String color;
    private String genero;
    private String raza;
    private Integer edad;

    //Metodo constructor (nos permite inicializar los atributos de la clase)
    public Gato(String color, String genero, String raza, Integer edad){
        this.color=color;
        this.genero=genero;
        this.raza=raza;
        this.edad=edad;

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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    //Métodos
    public void maullar(){
        System.out.println("Miau miau");
    }

    public void trepar(){
        System.out.println("Estoy trepando");
    }

    public void comer(){
        System.out.println("Estoy comiento croquetas");
    }
    
}
