package com.example.contaluzapi.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "poste")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class Poste {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "observacao")
    private String observacao;

    public Poste () {

    }
}
