package dev.jenniffer;


public class Libro {
    String isbn;
    String titulo;
    String autor;
    boolean disponible;

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

    public boolean disponible() {
        return this.disponible;
    }
}

