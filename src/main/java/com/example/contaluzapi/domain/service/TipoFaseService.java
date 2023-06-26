package com.example.contaluzapi.domain.service;

import com.example.contaluzapi.api.DTO.TipoFaseDto;
import com.example.contaluzapi.api.form.TipoFaseForm;
import com.example.contaluzapi.domain.model.TipoFase;
import com.example.contaluzapi.domain.repository.TipoFaseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TipoFaseService {

    private final TipoFaseRepository tipoFaseRepository;


    public TipoFaseDto buscarPorId(int id) {
        TipoFase tipoFase = encontrarEValidarTipoFase(id);
        return tipoFase.toDto();
    }

    public List<TipoFaseDto> listarTiposFase() {
        List<TipoFase> tipos = tipoFaseRepository.findAll();
        return tipos
                .stream()
                .map(TipoFase::toDto)
                .toList();
    }

    @Transactional
    public TipoFaseDto salvarTipoFase(TipoFaseForm form) {
        TipoFase tipoFase = form.toModel();
        tipoFaseRepository.save(tipoFase);
        return tipoFase.toDto();
    }

    @Transactional
    public TipoFaseDto atualizarTipoFase(int id, TipoFaseForm form) {
        TipoFase tipoFase = encontrarEValidarTipoFase(id);
        tipoFase.atualizar(form);
        return tipoFase.toDto();
    }

    @Transactional
    public void excluirTipoFase(int id) {
        TipoFase tipoFase = encontrarEValidarTipoFase(id);
        tipoFaseRepository.delete(tipoFase);
    }

    public Optional<TipoFase> encontrarPorId(int id) {
        return tipoFaseRepository.findById(id);
    }

    public TipoFase encontrarEValidarTipoFase(int id) {
        Optional<TipoFase> tipofase = encontrarPorId(id);
        if (tipofase.isEmpty()) {
            throw new RuntimeException("Tipo fase não encontrado");
        }

        return tipofase.get();
    }
}
