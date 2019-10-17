package com.dkbyte.project.service;

import com.dkbyte.project.entity.VehiculoEntity;

import java.util.List;

public interface VehiculoService {

    List<VehiculoEntity> findAll();

    void insert(VehiculoEntity vehiculo);

    VehiculoEntity findById(Long id);

    void update(VehiculoEntity vehiculo);

    void deleteById(Long id);
}
