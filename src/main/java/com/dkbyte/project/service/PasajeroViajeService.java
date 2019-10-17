package com.dkbyte.project.service;

import com.dkbyte.project.entity.PasajeroEntity;
import com.dkbyte.project.entity.PasajeroViajeEntity;

import java.util.List;

public interface PasajeroViajeService {
    List<PasajeroViajeEntity> findAll();

    void insert(PasajeroViajeEntity persona);

    PasajeroViajeEntity findById(Long id);

    void update(PasajeroViajeEntity persona);

    void deleteById(Long id);
}
