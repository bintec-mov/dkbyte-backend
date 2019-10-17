package com.dkbyte.project.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
<<<<<<< HEAD
=======

>>>>>>> 316ae218cfb1cf52e82d0c8131ba30804110b3e9
@Data
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

<<<<<<< HEAD
    @Column(name= "cupo")
    private Integer cupo;
=======
    @Column (name = "cupos")
    private  int numeroCupos;

>>>>>>> 316ae218cfb1cf52e82d0c8131ba30804110b3e9
}
