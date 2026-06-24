package POO;

public abstract class Animal {
    //atributos
    protected String nombre;
    protected Integer edad;

    //metodo constructor.
    public Animal(String nombre, Integer edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public abstract void emitirSonido();
    public abstract void comer();
    
}
