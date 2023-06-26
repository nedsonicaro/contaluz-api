package com.example.contaluzapi.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "medidor")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class Medidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id")
    private Integer id;

    @Column(name = "descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "roda_id")
    private Rota rota;

    @ManyToOne
    @JoinColumn(name = "poste_id")
    private Poste poste;

    public Medidor () {

    }
}
