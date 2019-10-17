package com.dkbyte.project.service.impl;

import com.dkbyte.project.entity.PasajeroEntity;
import com.dkbyte.project.entity.PasajeroViajeEntity;
import com.dkbyte.project.model.PasajeroViajeModel;
import com.dkbyte.project.repository.PasajeroViajeRepository;
import com.dkbyte.project.service.PasajeroViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasajeroViajeServiceImpl implements PasajeroViajeService {

    @Autowired
    private PasajeroViajeRepository pasajeroViajeRepository;

    @Override
    public List<PasajeroViajeEntity> findAll() {
        return pasajeroViajeRepository.findAll();
    }

    @Override
    public void insert(PasajeroViajeEntity pasajeroViajeEntity) {
        pasajeroViajeRepository.save(pasajeroViajeEntity);
    }

    @Override
    public PasajeroViajeEntity findById(Long id) {
        return pasajeroViajeRepository.findById(id).orElse(null);
    }

    @Override
    public void update(PasajeroViajeEntity pasajeroViajeEntity) {
        pasajeroViajeRepository.save(pasajeroViajeEntity);
    }

    @Override
    public void deleteById(Long id) {
        pasajeroViajeRepository.deleteById(id);
    }
}
