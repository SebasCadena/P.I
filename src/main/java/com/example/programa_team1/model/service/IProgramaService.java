package com.example.programa_team1.model.service;

import com.example.programa_team1.model.entities.Programa;

import java.util.List;

public interface IProgramaService {
    List<Programa>findAll();

    Programa save(Programa programa);//Guarda un programa y retorna un objeto de tipo programa

    Programa update(Programa programa);//Actualiza un programa

    Programa findById(Long codPrograma); //Busca un programa por su codigo

    void delete(Programa programa); //Elimina un programa de la base de datos

    void deleteById (Long codPrograma); //Elimina un programa de la base de datos por id
}
