package com.dkbyte.project.controller;


import com.dkbyte.project.entity.ConductorEntity;
import com.dkbyte.project.service.ConductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/conductores")
public class ConductorController {

    @Autowired
    private ConductorService conductorService;

    @GetMapping("/conductores")
    public List<ConductorEntity> findAll(){
        return conductorService.findAll();
    }

    @PostMapping("/conductor")
    public  void insert(@RequestBody ConductorEntity conductorEntity){
        conductorService.insert(conductorEntity);
    }

    @GetMapping ("/{id}/coductor")
    public ConductorEntity findById (@PathVariable Long id){
        return  conductorService.findById(id);
    }

    @PutMapping ("/{id}/conductor")
    public void update (@RequestBody ConductorEntity conductorEntity, @PathVariable Long id){
        conductorEntity.setId(id);
        conductorService.update(conductorEntity);
    }

    @DeleteMapping ("/{id}/conductor")
    public void delete (@PathVariable Long id){
        conductorService.deleteById(id);
    }


}
