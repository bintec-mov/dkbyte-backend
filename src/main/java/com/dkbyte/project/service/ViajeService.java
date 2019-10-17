package com.dkbyte.project.service;

import com.dkbyte.project.entity.ViajeEntity;

import java.util.List;

public interface ViajeService {

    List<ViajeEntity> findAll();

    void insert(ViajeEntity viajeEntity);

    ViajeEntity findById(Long id);

    void update(ViajeEntity viajeEntity);

    void deleteById(Long id);
}
