package com.dkbyte.project.repository;

import com.dkbyte.project.entity.PasajeroViajeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasajeroViajeRepository extends JpaRepository<PasajeroViajeEntity, Long> {
}

