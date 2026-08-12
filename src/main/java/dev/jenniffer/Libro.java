package dev.jenniffer;

/*
package dev.jenniffer;

public class libro {
    String titulo;
    int anio;
    String autor;
    public libro(String titulo, int anio, String autor) {

    }
    public void leer(){
*/
public class Libro {
    String isbn;
    String titulo;
    String autor;
    boolean disponible;

    // 2. Constructor (Inicializador)
    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public void prestar() {
        this.disponible = false;
    }

    public void devolver() {
        this.disponible = true;
    }

    public boolean estaDisponible() {
        return this.disponible;
    }
}

