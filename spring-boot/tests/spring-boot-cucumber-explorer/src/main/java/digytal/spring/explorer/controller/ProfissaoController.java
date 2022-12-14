package digytal.spring.explorer.controller;

import digytal.spring.explorer.model.Profissao;
import digytal.spring.explorer.repository.ProfissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("profissoes")
public class ProfissaoController {
    @Autowired
    private ProfissaoRepository repository;
    @GetMapping
    public List<Profissao> getProfissoes(){
        return repository.getProfissoes();
    }
}
