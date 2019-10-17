package com.dkbyte.project.service;

import com.dkbyte.project.entity.PasajeroEntity;

import java.util.List;
import java.util.Optional;

public interface PasajeroService {

    List<PasajeroEntity> findAll();

    void insert(PasajeroEntity pasajero);

    PasajeroEntity findById(Long id);

    void update(PasajeroEntity pasajero);

    void deleteById(Long id);
}
