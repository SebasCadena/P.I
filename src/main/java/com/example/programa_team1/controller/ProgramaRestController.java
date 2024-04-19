package com.example.programa_team1.controller;

import com.example.programa_team1.model.entities.Programa;
import com.example.programa_team1.model.service.IProgramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programa")
public class ProgramaRestController {

    private IProgramaService programaService;

    @Autowired
    public ProgramaRestController(IProgramaService programaService){
        this.programaService = programaService;
    }
    @GetMapping("/programas")
    public List<Programa> listar() {
        return this.programaService.findAll();
    }

    @PostMapping("/Create")
    public Programa createPrograma(@RequestBody Programa programa){
        return this.programaService.save(programa);
    }

    @PutMapping("/Update")
    public Programa updatePrograma(@RequestBody Programa programa){
        return this.programaService.save(programa);
    }

}
