package com.dkbyte.project.controller;


import com.dkbyte.project.entity.PersonaEntity;
import com.dkbyte.project.entity.ViajeEntity;
import com.dkbyte.project.service.ViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/viajes")
public class ViajeController {

    @Autowired
    private ViajeService viajeService;

    @GetMapping ("/viajes")
    public List<ViajeEntity>  findAll(){
        return viajeService.findAll();
    }

    @PostMapping ("/viaje")
    public void insert (@RequestBody ViajeEntity viajeEntity){
        viajeService.insert(viajeEntity);


    }

    @GetMapping ("/viaje/{id}")
    public ViajeEntity findById(@PathVariable Long id){
        return viajeService.findById(id);
    }

    @PutMapping ("/viaje/{id}")
    public void update (@RequestBody ViajeEntity viajeEntity, @PathVariable Long id){
        viajeEntity.setId(id);
        viajeService.update(viajeEntity);
    }


}
