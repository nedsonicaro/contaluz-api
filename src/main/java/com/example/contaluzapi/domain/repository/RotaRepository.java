package com.example.contaluzapi.domain.repository;

import com.example.contaluzapi.domain.model.Rota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RotaRepository extends JpaRepository<Rota, Integer> {
}
