package com.example.programa_team1.model.service;

import com.example.programa_team1.model.dao.IProgramaDao;
import com.example.programa_team1.model.entities.Programa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramaServiceImp implements IProgramaService {

    IProgramaDao programaDao;

    @Override
    public List<Programa> findAll(){
        return (List<Programa>)programaDao.findAll();
    }
    /*
    Cuando estén todos los metodos quitar el comentario de arriba para que reconozca
    las implementaciones hechas en IProgramaService
     */


}
