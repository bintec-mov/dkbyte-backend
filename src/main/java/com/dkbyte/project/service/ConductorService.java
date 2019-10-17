package com.dkbyte.project.service;

import com.dkbyte.project.entity.ConductorEntity;

import java.util.List;

public interface ConductorService {
    List<ConductorEntity> findAll();

    void insert(ConductorEntity conductorEntity);

    ConductorEntity findById(Long id);

    void update(ConductorEntity conductorEntity);

    void deleteById(Long id);
}
