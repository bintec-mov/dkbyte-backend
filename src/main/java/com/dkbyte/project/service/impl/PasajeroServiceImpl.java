package com.dkbyte.project.service.impl;

import com.dkbyte.project.entity.PasajeroEntity;

import com.dkbyte.project.repository.PasajeroRepository;
import com.dkbyte.project.service.PasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PasajeroServiceImpl implements PasajeroService {

    @Autowired
    PasajeroRepository pasajeroRepository;
    @Override
    public List<PasajeroEntity> findAll() {
        return pasajeroRepository.findAll();
    }

    @Override
    public void insert(PasajeroEntity pasajero) {
        pasajeroRepository.save(pasajero);
    }

    @Override
    public PasajeroEntity findById(Long id) {
        return pasajeroRepository.findById(id).orElse(null);
    }

    @Override
    public void update(PasajeroEntity pasajero) {
        pasajeroRepository.save(pasajero);
    }

    @Override
    public void deleteById(Long id) {
        pasajeroRepository.deleteById(id);
    }
}
