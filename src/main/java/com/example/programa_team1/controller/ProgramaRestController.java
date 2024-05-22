package com.example.programa_team1.controller;

import com.example.programa_team1.model.entities.Programa;
import com.example.programa_team1.model.service.IProgramaService;
import com.example.programa_team1.configuracion.ResourseNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/programa-service")
public class ProgramaRestController {

    private IProgramaService programaService;

    @Autowired
    public ProgramaRestController(IProgramaService programaService){
        this.programaService = programaService;
    }


    //Este metodo obtiene el listado de los programas
    @GetMapping("/programas")
    public List<Programa> listar() {
        return this.programaService.findAll();
    }

    //Este metodo añade un programa a la lista
    @PostMapping("/programa")
    public Programa createPrograma(@RequestBody Programa programa){
        return this.programaService.save(programa);
    }

    //Este metodo obtiene un programa por su id
    @GetMapping("/programa/{codprograma}")
    public ResponseEntity<Programa> buscarPrograma(@PathVariable Long codprograma) {
        Optional<Programa> optionalPrograma = Optional.ofNullable(programaService.findById(codprograma));
        if (optionalPrograma.isPresent()) {
            Programa programa = optionalPrograma.get();
            return ResponseEntity.ok(programa);
        } else {
            throw new ResourseNotFoundException("No existe el programa con el ID: " + codprograma);
        }
    }

    //Metodo que actualiza un programa
    @PutMapping("/programa/{codprograma}")
    public ResponseEntity<Programa> actualizarPrograma(@PathVariable Long codprograma, @RequestBody Programa detallesPrograma) {
        Optional<Programa> optionalPrograma = Optional.ofNullable(programaService.findById(codprograma));
        if (optionalPrograma.isPresent()) {
            Programa programa = optionalPrograma.get();
            programa.setNomprograma(detallesPrograma.getNomprograma());
            programa.setCodfacultad(detallesPrograma.getCodfacultad());
            programa.setCodigodocente(detallesPrograma.getCodigodocente());

            Programa programaActualizado = programaService.save(programa);
            return ResponseEntity.ok(programaActualizado);
        } else {
            throw new ResourseNotFoundException("No existe el programa con el ID: " + codprograma);
        }
    }



    //Este metodo borra un programa por su id
    @DeleteMapping("/programa/{codPrograma}")
    public void deleteById(@PathVariable Long codPrograma){
        this.programaService.deleteById(codPrograma);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Programa programa){
        this.programaService.delete(programa);
    }

}
