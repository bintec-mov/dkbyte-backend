package com.dkbyte.project.service;

import com.dkbyte.project.entity.PersonaEntity;

import java.util.List;

public interface PersonaService {
    List<PersonaEntity> findAll();

    void insert(PersonaEntity persona);

    PersonaEntity findById(Long id);

    void update(PersonaEntity persona);

    void deleteById(Long id);

}
