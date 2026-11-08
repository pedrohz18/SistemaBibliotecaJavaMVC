package br.com.biblioteca.sistema_biblioteca.Repository;

import br.com.biblioteca.sistema_biblioteca.Model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
