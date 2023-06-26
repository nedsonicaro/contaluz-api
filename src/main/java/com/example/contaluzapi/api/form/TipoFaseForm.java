package com.example.contaluzapi.api.form;

import com.example.contaluzapi.domain.model.TipoFase;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoFaseForm {

    private String descricao;

    public TipoFase toModel() {
        return new TipoFase(descricao);
    }
}
