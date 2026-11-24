package models;

public class Videojuego {
    private int id;
    private String titulo;
    private String genero;
    private String plataforma;
    private int lanzamiento;
    private double precio;

    public Videojuego(String titulo, String genero, String plataforma, int lanzamiento, double precio) {
        this.titulo = titulo;
        this.genero = genero;
        this.plataforma = plataforma;
        this.lanzamiento = lanzamiento;
        this.precio = precio;
    }

    public Videojuego(int id, String titulo, String genero, String plataforma, int lanzamiento, double precio) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.plataforma = plataforma;
        this.lanzamiento = lanzamiento;
        this.precio = precio;
    }

    //getters y setters

    //getters y setters id
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}


    //getters y setters titulo
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}


    //getters y setters genero
    public String getGenero() {return genero;}
    public void setGenero(String genero) {this.genero = genero;}


    //getters y setters plataforma
    public String getPlataforma() {return plataforma;}
    public void setPlataforma(String plataforma) {this.plataforma = plataforma;}


    //getters y setters lanzamiento
    public int getLanzamiento() {return lanzamiento;}
    public void setLanzamiento(int lanzamiento) {this.lanzamiento = lanzamiento;}



    //getters y setters precio
    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}


    @Override 
    public String toString(){
        return "[" + id + "] " + titulo + " | " + plataforma + " (" + lanzamiento + ") - $" + precio;
    }

}
