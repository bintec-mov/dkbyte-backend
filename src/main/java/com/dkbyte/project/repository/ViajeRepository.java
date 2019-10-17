package com.dkbyte.project.repository;

import com.dkbyte.project.entity.ViajeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViajeRepository extends JpaRepository<ViajeEntity, Long> {
}
