package com.dkbyte.project.repository;

import com.dkbyte.project.entity.ConductorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConductorRepository extends JpaRepository<ConductorEntity, Long> {
}
