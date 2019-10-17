package com.dkbyte.project.service.impl;
import com.dkbyte.project.entity.ViajeEntity;
import com.dkbyte.project.repository.ViajeRepository;
import com.dkbyte.project.service.ViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViajeServiceImpl implements ViajeService {

    @Autowired
    private ViajeRepository viajeRepository;


    @Override
    public List<ViajeEntity> findAll() {
        return viajeRepository.findAll();
    }

    @Override
    public void insert(ViajeEntity viajeEntity) {

    }

    @Override
    public ViajeEntity findById(Long id) {
        return null;
    }

    @Override
    public void update(ViajeEntity viajeEntity) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
