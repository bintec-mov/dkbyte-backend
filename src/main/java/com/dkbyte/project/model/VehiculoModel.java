package com.dkbyte.project.model;

import lombok.Data;

@Data
public class VehiculoModel {
    private long id;
    private String modelo;
    private String marca;
    private String placa;
    private ConductorModel conductor;

    public ConductorModel getVehiculo(){
        if( conductor== null){
            conductor = new ConductorModel();
        }
        return conductor;
    }
}
