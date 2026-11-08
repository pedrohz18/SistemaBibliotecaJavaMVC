package br.com.biblioteca.sistema_biblioteca.Repository;

import br.com.biblioteca.sistema_biblioteca.Model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor,Long> {
}
