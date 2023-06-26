package com.example.contaluzapi.domain.repository;

import com.example.contaluzapi.domain.model.Cobranca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CobrancaRepository extends JpaRepository<Cobranca, Integer> {
}
