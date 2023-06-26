package com.example.contaluzapi.domain.repository;

import com.example.contaluzapi.domain.model.Poste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosteRepository extends JpaRepository<Poste, Integer> {
}
