package com.dkbyte.project.repository;

import com.dkbyte.project.entity.PasajeroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasajeroRepository extends JpaRepository<PasajeroEntity, Long> {
}
