package com.dkbyte.project.service.impl;

import com.dkbyte.project.entity.PersonaEntity;
import com.dkbyte.project.repository.PersonaRepository;
import com.dkbyte.project.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<PersonaEntity> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public void insert(PersonaEntity persona) {
        personaRepository.save(persona);
    }

    @Override
    public PersonaEntity findById(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void update(PersonaEntity persona) {
        personaRepository.save(persona);
    }

    @Override
    public void deleteById(Long id) {
        personaRepository.deleteById(id);
    }
}
