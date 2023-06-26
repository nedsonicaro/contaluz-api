package com.example.contaluzapi.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Entity
@Table(name = "tarifa")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class Tarifa {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "taxa")
    private String taxa;

    @Column(name = "lei")
    private String lei;

    @Column(name = "data_inicio")
    private Date dataInicio;

    @Column(name = "data_final")
    private Date dataFinal;

    @ManyToOne
    @JoinColumn(name = "classe")
    private Classe classe;
}
