package com.example.contaluzapi.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "pessoa")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "cnpj")
    private String cnpj;

    @ManyToOne
    @JoinColumn(name = "tipo_pessoa_id")
    private TipoPessoa tipoPessoa;

    public Pessoa() {

    }
}
