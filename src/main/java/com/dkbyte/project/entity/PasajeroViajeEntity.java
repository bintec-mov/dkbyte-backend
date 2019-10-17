package com.dkbyte.project.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "pasajero_vehiculo")
public class PasajeroViajeEntity implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private  long id;

    @ManyToOne
    @JoinColumn(name = "id_pasajero")
    private PasajeroEntity pasajero;

    @ManyToOne
    @JoinColumn(name = "id_viaje")
    private ViajeEntity viaje;

    public ViajeEntity getViaje(){
        if(viaje==null){
            viaje = new ViajeEntity();

        }
        return viaje;
    }
    public PasajeroEntity getPasajero(){
        if (pasajero==null){
            pasajero = new PasajeroEntity();
        }
        return pasajero;
    }
}
