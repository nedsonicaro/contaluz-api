package com.example.contaluzapi.domain.repository;

import com.example.contaluzapi.domain.model.TarefaRota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRotaRepository extends JpaRepository<TarefaRota, Integer> {
}
