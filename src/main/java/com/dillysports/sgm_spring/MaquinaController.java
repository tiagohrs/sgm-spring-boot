package com.dillysports.sgm_spring;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController 
@RequestMapping("/maquinas")
public class MaquinaController {

    @Autowired 
    private MaquinaRepository repository;

    @GetMapping 
    public List<Maquina> listarTodas() {
        return repository.findAll();
    }

    @PostMapping 
    public Maquina inserir(@RequestBody Maquina maquina) {
        return repository.save(maquina);
    }

    @PutMapping("/{id}")
    public Maquina atualizar(@PathVariable int id, @RequestBody Maquina maquinaAtualizada) {
        maquinaAtualizada.setId(id);
        return repository.save(maquinaAtualizada);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable int id) {
        repository.deleteById(id);
    }

}