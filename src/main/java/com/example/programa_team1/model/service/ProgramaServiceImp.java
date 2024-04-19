package com.example.programa_team1.model.service;

import com.example.programa_team1.model.dao.IProgramaDao;
import com.example.programa_team1.model.entities.Programa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramaServiceImp implements IProgramaService {

    IProgramaDao programaDao;

    @Autowired
    public ProgramaServiceImp(IProgramaDao programaDao){this.programaDao = programaDao;}

    @Override
    public List<Programa> findAll(){
        return (List<Programa>)programaDao.findAll();
    }

    @Override
    public Programa save(Programa programa){
        return programaDao.save(programa);
    }

    @Override
    public Programa update(Programa programa){
        return programaDao.save(programa);
    }


}
