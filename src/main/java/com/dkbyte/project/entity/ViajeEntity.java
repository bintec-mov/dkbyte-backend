package com.dkbyte.project.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name= "Viaje")
public class ViajeEntity implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name ="dir_salida")
    private String direccionSalida;

    @Column(name ="dir_llegada")
    private String direccionLlegada;

    @Column (name = "precio")
    private int precio;

    @Column (name = "hora_salida")
    private String horasalida;

}
