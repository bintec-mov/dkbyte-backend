package com.dkbyte.project.controller;

import com.dkbyte.project.entity.PasajeroViajeEntity;
import com.dkbyte.project.service.PasajeroViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pasajerosViaje")
public class PasajeroViajeController {

    @Autowired
    private PasajeroViajeService  pasajeroViajeService;

    @GetMapping("/pasajeroViaje")
    public List<PasajeroViajeEntity> findAll(){
        return pasajeroViajeService.findAll();
    }

    @PostMapping("/pasajeroViaje")
    public void insert(@RequestBody PasajeroViajeEntity pasajeroViaje){
        pasajeroViajeService.insert(pasajeroViaje);
    }

    @GetMapping("/pasajeroViaje/{id}")
    public PasajeroViajeEntity findById(@PathVariable Long id){
        return pasajeroViajeService.findById(id);
    }

    @PutMapping("/pasajeroViaje/{id}")
    public void update(@RequestBody PasajeroViajeEntity pasajeroViaje, @PathVariable Long id){
        pasajeroViaje.setId(id);
        pasajeroViajeService.update(pasajeroViaje);
    }

    @DeleteMapping("/persona/{id}")
    public void delete(@PathVariable  Long id){
        pasajeroViajeService.deleteById(id);
    }
}
