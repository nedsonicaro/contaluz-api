package com.example.contaluzapi.domain.model;

import com.example.contaluzapi.api.DTO.TipoFaseDto;
import com.example.contaluzapi.api.form.TipoFaseForm;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "tipo_fase")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class TipoFase {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "descricao")
    private String descricao;

    public TipoFaseDto toDto() {
        return new TipoFaseDto(this);
    }

    public TipoFase(String descricao) {
        this.descricao = descricao;
    }

    public void atualizar(TipoFaseForm form) {
        this.descricao = form.getDescricao();
    }

    public TipoFase() {
    }
}
