package com.example.contaluzapi.api.controller;

import com.example.contaluzapi.api.DTO.TipoFaseDto;
import com.example.contaluzapi.api.form.TipoFaseForm;
import com.example.contaluzapi.domain.service.TipoFaseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/tipo-fase")
@AllArgsConstructor
public class TipoFaseController {

    private final TipoFaseService tipoFaseService;

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(value = "/{tipoFaseId}", produces = "application/json")
    public TipoFaseDto buscarPorId(@PathVariable("tipoFaseId") int id) {
        return tipoFaseService.buscarPorId(id);
    }

    @GetMapping(value = "/listar", produces = "application/json")
    public ResponseEntity<List<TipoFaseDto>> listarTiposFase() {
        List<TipoFaseDto> tipos = tipoFaseService.listarTiposFase();
        return tipos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(tipos);
    }

    @PostMapping(produces = "application/json")
    @ResponseStatus(value = HttpStatus.CREATED)
    public TipoFaseDto cadastrarTipoFase(@RequestBody TipoFaseForm form) {
        return tipoFaseService.salvarTipoFase(form);
    }

    @PutMapping(value = "/{tipoFaseId}", produces = "application/json")
    @ResponseStatus(value = HttpStatus.OK)
    public TipoFaseDto atualizarTipoFase(@PathVariable("tipoFaseId") int id,
                                         @RequestBody TipoFaseForm form) {

        return tipoFaseService.atualizarTipoFase(id, form);
    }

    @DeleteMapping(value = "/{tipoFaseId}", produces = "application/json")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deletarTipoFase(@PathVariable("tipoFaseId") int id) {
        tipoFaseService.excluirTipoFase(id);
    }
}
