package br.com.biblioteca.sistema_biblioteca.Repository;

import br.com.biblioteca.sistema_biblioteca.Model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    List<Livro> id(Long id);
}
