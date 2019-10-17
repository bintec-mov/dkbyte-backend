package com.dkbyte.project.entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "vehiculo")
public class VehiculoEntity implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;
    @Column(name = "modelo")
    private String modelo;
    @Column(name="marca")
    private String marca;
    @Column(name = "placa")
    private String placa;

    @ManyToOne
    @JoinColumn(name="id_Conductor")
    private ConductorEntity conductor;

    public ConductorEntity getVehiculo(){
        if( conductor== null){
            conductor = new ConductorEntity();
        }
        return conductor;
    }

}
