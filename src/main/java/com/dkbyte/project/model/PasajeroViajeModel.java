package com.dkbyte.project.model;

import lombok.Data;

@Data
public class PasajeroViajeModel {

    private PasajeroModel pasajero;
    private ViajeModel viaje;

    public ViajeModel getViaje(){
        if(viaje==null){
            viaje = new ViajeModel();

        }
        return viaje;
    }
    public PasajeroModel getPasajero(){
        if (pasajero==null){
            pasajero = new PasajeroModel();
        }
        return pasajero;
    }}
