package br.com.biblioteca.sistema_biblioteca.Controller;

import br.com.biblioteca.sistema_biblioteca.Model.Livro;
import br.com.biblioteca.sistema_biblioteca.Repository.LivroRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/livros")
public class LivroController {
    //Repositório
    private final LivroRepository repository;

    public LivroController(LivroRepository repository) {
        this.repository = repository;
    }

    //Lista dos Livro
    @GetMapping
    public String listar(Model model){
        model.addAttribute("livros",repository.findAll());
        return "Livros/lista";
    }

    //Rota livros/novo para Adição de um Livro no Banco
    @GetMapping("/novo")
    public String adcLivro(Model model){
    model.addAttribute("livro",new Livro());
    return "Livros/form";
    }

//    //Inicio da Aplicação
//    @GetMapping
//    public String inicio(Model model){
//        Livro livro = new Livro();
//        //Aponta para a Template de Inicio a Aba de Livros
//        return "Livros/inicio";
//    }

    //Post para Adição do Objeto no Banco
    @PostMapping
    public String cadastrarLivro(@ModelAttribute Livro livro){
    repository.save(livro);
    //Spring Vai Preencher o Livro com oque veio no Formulário de Cadastro
    return "redirect:/livros";
    }
}
