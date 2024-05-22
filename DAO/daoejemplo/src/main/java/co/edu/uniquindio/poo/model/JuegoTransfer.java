package co.edu.uniquindio.poo.model;


public class JuegoTransfer{
    //atributos
    private String nombre;
    private int id;
    private String genero;
    private Double precio;

    // Definicion Constructor
    public JuegoTransfer(String nombre, String genero, double precio, int id){
        this.nombre = nombre;
        this.genero = genero;
        this.precio = precio;
        this.id = id;
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Metodo ToStr

    public String toString(){
        return ("Nombre: " + getNombre() + " Genero: " + getGenero() + "\n Precio: " + getPrecio() + " ID: " + getId());
    }

}