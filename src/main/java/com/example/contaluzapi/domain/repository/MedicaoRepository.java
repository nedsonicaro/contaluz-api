package com.example.contaluzapi.domain.repository;

import com.example.contaluzapi.domain.model.Medicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicaoRepository extends JpaRepository<Medicao, Integer> {
}
