package br.com.biblioteca.sistema_biblioteca.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;
import org.hibernate.annotations.Array;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Atributos
    private String nome;
    private String idade;
    private String email;
    //Livros do Autor
    @OneToMany(mappedBy = "autor")
    private List<Livro> livros = new ArrayList<>();

    //Construtor
    public Autor(){};

    //Getters And Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
