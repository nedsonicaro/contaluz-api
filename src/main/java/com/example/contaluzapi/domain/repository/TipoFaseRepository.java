package com.example.contaluzapi.domain.repository;

import com.example.contaluzapi.domain.model.TipoFase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TipoFaseRepository extends JpaRepository<TipoFase, Integer> {

    @Override
    Optional<TipoFase> findById(int id);
}
