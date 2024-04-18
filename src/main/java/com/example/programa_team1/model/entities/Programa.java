package com.example.programa_team1.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "programa")
public class Programa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long codPrograma, codFacultad;
    private String nomPrograma, nomFacultad;


}
