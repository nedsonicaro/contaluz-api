package com.example.contaluzapi.domain.repository;

import com.example.contaluzapi.domain.model.TipoPessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPessoaRepository extends JpaRepository<TipoPessoa, Integer> {
}
