package com.dkbyte.project.model;

public class PasajeroVehiculoModel {

    private PasajeroModel pasajero;
    private VehiculoModel vehiculo;

    public VehiculoModel getVehiculo(){
        if(vehiculo==null){
            vehiculo = new VehiculoModel();

        }
        return vehiculo;
    }
    public PasajeroModel getPasajero(){
        if (pasajero==null){
            pasajero = new PasajeroModel();
        }
        return pasajero;
    }}
