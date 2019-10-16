package com.dkbyte.project.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "pasajero_vehiculo")
public class PasajeroVehiculoEntity implements Serializable {

    @Id
    @Column(name = "id")
    private  long id;

    @ManyToOne
    @JoinColumn(name = "id_pasajero")
    private PasajeroEntity pasajero;

    @ManyToOne
    @JoinColumn(name = "id_vehiculo")
    private VehiculoEntity vehiculo;

    public VehiculoEntity getVehiculo(){
        if(vehiculo==null){
            vehiculo = new VehiculoEntity();

        }
        return vehiculo;
    }
    public PasajeroEntity getPasajero(){
        if (pasajero==null){
            pasajero = new PasajeroEntity();
        }
        return pasajero;
    }
}
