package com.example.contaluzapi.domain.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "funcionario")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class Funcionario {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "codigo_funcional")
    private String codigoFuncional;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    public Funcionario() {

    }
}
