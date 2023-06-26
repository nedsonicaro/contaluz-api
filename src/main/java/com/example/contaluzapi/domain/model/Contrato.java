package com.example.contaluzapi.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Entity
@Table(name = "contrato")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class Contrato {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data_inicio")
    private Date dataInicio;

    @Column(name = "data_criacao")
    private Date dataCriacao;

    @ManyToOne
    @JoinColumn(name = "medidor_id")
    private Medidor medidor;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Classe classe;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Contrato () {

    }
}
