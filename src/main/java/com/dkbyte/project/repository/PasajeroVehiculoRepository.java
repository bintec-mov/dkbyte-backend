package com.dkbyte.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasajeroVehiculoRepository extends JpaRepository<PasajeroVehiculoRepository, Long> {
}
