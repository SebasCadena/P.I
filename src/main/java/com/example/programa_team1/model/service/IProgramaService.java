package com.example.programa_team1.model.service;

import com.example.programa_team1.model.entities.Programa;

import java.util.List;

public interface IProgramaService {
    void delete(Programa programa); //Elimina un programa de la base de datos
    List<Programa>findAll(); //Devuelve una lista con todos los programas
    Programa save(Programa programa);//Guarda un programa y retorna un objeto de tipo programa

    Programa findById(Long codPrograma); //Busca un programa por su codigo

    Programa update(Programa programa);//Actualiza un programa

}
