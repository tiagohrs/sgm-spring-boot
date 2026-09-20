package com.dillysports.sgm_spring;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ordens-servico")
public class OrdemServicoController {

    @Autowired
    private OrdemServicoRepository repository;

    @GetMapping
    public List<OrdemServico> listarTodas() {
        return repository.findAll();
    }

    @PostMapping
    public OrdemServico inserir(@RequestBody OrdemServico ordemServico) {
        return repository.save(ordemServico);
    }

    @PutMapping("/{id}")
    public OrdemServico atualizar(@PathVariable int id, @RequestBody OrdemServico osAtualizada) {
        osAtualizada.setId(id);
        return repository.save(osAtualizada);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable int id) {
        repository.deleteById(id);
    }

}