package com.dkbyte.project.controller;

import com.dkbyte.project.entity.VehiculoEntity;
import com.dkbyte.project.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoService  vehiculoService;

    @GetMapping("/vehiculos")
    public List<VehiculoEntity> findAll(){
        return vehiculoService.findAll();
    }

    @PostMapping("/vehiculo")
    public void insert(@RequestBody VehiculoEntity vehiculo){
        vehiculoService.insert(vehiculo);
    }

    @GetMapping("/vehiculo/{id}")
    public VehiculoEntity findById(@PathVariable  Long id){
        return vehiculoService.findById(id);
    }

    @PutMapping("/vehiculo/{id}")
    public void update(@RequestBody VehiculoEntity vehiculo, @PathVariable  Long id){
        vehiculo.setId(id);
        vehiculoService.update(vehiculo);
    }

    @DeleteMapping("/{id}/vehiculo")
    public void delete(@PathVariable Long id){
        vehiculoService.deleteById(id);
    }
}
