package com.example.contaluzapi.domain.repository;

import com.example.contaluzapi.domain.model.Medidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedidorRepository extends JpaRepository<Medidor, Integer> {
}
