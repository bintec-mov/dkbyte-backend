package com.dkbyte.project.controller;

import com.dkbyte.project.entity.PasajeroEntity;
import com.dkbyte.project.entity.ViajeEntity;
import com.dkbyte.project.service.PasajeroService;
import com.dkbyte.project.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pasajeros")
public class PasajeroController {

    @Autowired
    private PasajeroService pasajeroService;

    @GetMapping("/pasajeros")
    public List<PasajeroEntity> findAll(){
        return pasajeroService.findAll();
    }

    @PostMapping("/pasajero")
    public void insert(@RequestBody PasajeroEntity pasajero){
        pasajeroService.insert(pasajero);
    }

    @GetMapping("/{id}/persona")
    public PasajeroEntity findById(@PathVariable Long id){
        return  pasajeroService.findById(id);
    }

    @PutMapping("{id}/persona")
    public void update(@RequestBody PasajeroEntity pasajero, @PathVariable Long id){
        pasajero.setId(id);
    }

    @DeleteMapping("/{id}/persona")
    public void delete(@PathVariable Long id){
        pasajeroService.deleteById(id);
    }
}
