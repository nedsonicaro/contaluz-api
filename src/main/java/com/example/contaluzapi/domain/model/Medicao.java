package com.example.contaluzapi.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Entity
@Table(name = "medicao")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class Medicao {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "mes")
    private String mes;

    @Column(name = "ano")
    private String ano;

    @Column(name = "data_medicao")
    private Date dataMedicao;

    @Column(name = "consumo")
    private String consumo;

    @ManyToOne
    @JoinColumn(name = "medidor_id")
    private Medidor medidor;

    @ManyToOne
    @JoinColumn(name = "time_rota_id")
    private TimeRota timeRota;

    public Medicao () {

    }
}
