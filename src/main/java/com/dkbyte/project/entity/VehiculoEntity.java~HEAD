package com.dkbyte.project.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "vehiculo")
public class VehiculoEntity {
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
    @JoinColumn(name = "id_conductor")

}
