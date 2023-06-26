package com.example.contaluzapi.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Entity
@Table
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class TarefaRota {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "observacao")
    private String observacao;

    @Column(name = "data_inicio")
    private Date dataInicio;

    @Column(name = "data_fim")
    private Date dataFim;

    @Column(name = "tarefa_rotcao")
    private String tarefaRotacao;

    @ManyToOne
    @JoinColumn(name = "rota_id")
    private Rota rota;

    public TarefaRota () {

    }
}
