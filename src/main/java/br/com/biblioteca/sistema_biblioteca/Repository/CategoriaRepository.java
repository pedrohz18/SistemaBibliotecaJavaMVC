package br.com.biblioteca.sistema_biblioteca.Repository;

import br.com.biblioteca.sistema_biblioteca.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
