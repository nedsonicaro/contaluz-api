package com.example.contaluzapi.api.DTO;

import com.example.contaluzapi.domain.model.TipoFase;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoFaseDto {

    private int id;

    private String descricao;

    public TipoFaseDto(TipoFase tipoFase) {
        this.id = tipoFase.getId();
        this.descricao = tipoFase.getDescricao();
    }
}
