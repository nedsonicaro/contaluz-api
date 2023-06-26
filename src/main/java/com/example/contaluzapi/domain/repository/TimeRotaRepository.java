package com.example.contaluzapi.domain.repository;

import com.example.contaluzapi.domain.model.TimeRota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRotaRepository extends JpaRepository<TimeRota, Integer> {
}
