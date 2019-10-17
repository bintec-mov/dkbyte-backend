package com.dkbyte.project.controller;


import com.dkbyte.project.entity.PersonaEntity;
import com.dkbyte.project.model.PersonaModel;
import com.dkbyte.project.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private PersonaService personaService;



    @GetMapping("/persona")
    public List<PersonaEntity> findAll(){
        return personaService.findAll();
    }

    @PostMapping ("/persona")
    public  void insert(@RequestBody PersonaEntity personaEntity){

    }

    @GetMapping ("/personas/{id}")
    public PersonaEntity findById (@PathVariable Long id){
        return  personaService.findById(id);
    }

    @PutMapping ("/personas/{id}")
    public void update (@RequestBody PersonaEntity personaEntity, @PathVariable Long id){

        personaEntity.setId(id);
        personaService.update(personaEntity);
    }

    @DeleteMapping ("/personas/{id}")
    public void delete (@PathVariable Long id){
        personaService.deleteById(id);
    }
}
