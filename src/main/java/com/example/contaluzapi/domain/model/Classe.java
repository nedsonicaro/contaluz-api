package com.example.contaluzapi.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "classe")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class Classe {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_tipo_fase")
    private TipoFase tipoFase;

    public Classe () {

    }
}
