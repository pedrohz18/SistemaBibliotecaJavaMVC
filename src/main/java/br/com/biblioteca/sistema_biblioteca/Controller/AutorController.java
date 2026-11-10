package br.com.biblioteca.sistema_biblioteca.Controller;

import br.com.biblioteca.sistema_biblioteca.Model.Autor;
import br.com.biblioteca.sistema_biblioteca.Repository.AutorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/autores")
public class AutorController {
    //Reposítorio
    private final AutorRepository repository;

    public AutorController(AutorRepository repository){
        this.repository = repository;
    }

    //Lista de Autores
    @GetMapping
    public String lista(Model model){
        model.addAttribute("autores", repository.findAll());
        return "Autores/lista";
    }

    //Cadastro de Autor
    @GetMapping("/novo")
    public String formularioAutor(Model model){
        model.addAttribute("autor",new Autor());
        return "Autores/form";
    }

    //Método Post para Salvar os Autores no DB
    @PostMapping
    public String adcAutor(@ModelAttribute Autor autor){
        repository.save(autor);
        return "redirect:/autores";
    }

    // Remoção de AUtor do DB
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/autores";
    }

}
