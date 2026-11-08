package br.com.biblioteca.sistema_biblioteca.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Atributos
    private String autor;
    private String titulo;
    private String isbn;

    //Constructor
    public Livro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }
    public Livro(){};

    //Getters And Setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
