package com.example.contaluzapi.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "cobranca")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class Cobranca {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "mes_referencia")
    private String mesReferencia;

    @Column(name = "ano_referencia")
    private String anoReferencia;

    @ManyToOne
    @JoinColumn(name = "tarifa_id")
    private Tarifa tarifa;

    @ManyToOne
    @JoinColumn(name = "medicao_id")
    private Medicao medicao;

    public Cobranca () {

    }
}
