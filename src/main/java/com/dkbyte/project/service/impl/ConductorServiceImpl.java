package com.dkbyte.project.service.impl;

import com.dkbyte.project.entity.ConductorEntity;
import com.dkbyte.project.repository.ConductorRepository;
import  com.dkbyte.project.service.ConductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConductorServiceImpl implements ConductorService {

    @Autowired
    private ConductorRepository conductorRepository;

    @Override
    public List<ConductorEntity> findAll() {
        return conductorRepository.findAll();
    }

    @Override
    public void insert(ConductorEntity conductorEntity) {
        conductorRepository.save(conductorEntity);
    }

    @Override
    public ConductorEntity findById(Long id) {
        return conductorRepository.findById(id).orElse(null);
    }

    @Override
    public void update(ConductorEntity conductorEntity) {
        conductorRepository.save(conductorEntity);
    }

    @Override
    public void deleteById(Long id) {
        conductorRepository.deleteById(id);
    }
}
