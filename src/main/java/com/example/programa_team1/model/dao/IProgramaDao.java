package com.example.programa_team1.model.dao;

import com.example.programa_team1.model.entities.Programa;
import org.springframework.data.repository.CrudRepository;

/*
Dao Hereda CrudRepository para realizar las operaciones en la implementación
 */
public interface IProgramaDao extends CrudRepository <Programa, Long> {
}
