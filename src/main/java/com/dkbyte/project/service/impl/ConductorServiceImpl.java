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
    public List<ConductorService> findAll() {
        return null;
    }

    @Override
    public void insert(ConductorEntity conductorEntity) {

    }

    @Override
    public ConductorEntity findById(Long id) {
        return null;
    }

    @Override
    public void update(ConductorEntity conductorEntity) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
