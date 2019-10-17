package com.dkbyte.project.service.impl;

import com.dkbyte.project.entity.VehiculoEntity;
import com.dkbyte.project.repository.VehiculoRepository;
import com.dkbyte.project.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoServiceImpl implements VehiculoService {
    @Autowired
    private VehiculoRepository vehiculoRepository;


    @Override
    public List<VehiculoEntity> findAll() {
        vehiculoRepository.findAll();
    }

    @Override
    public void insert(VehiculoEntity vehiculo) {
        vehiculoRepository.save(vehiculo);
    }

    @Override
    public VehiculoEntity findById(Long id) {
        return null;
    }

    @Override
    public void update(VehiculoEntity vehiculo) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
