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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public ConductorEntity getConductor() {
        return conductor;
    }

    public void setConductor(ConductorEntity conductor) {
        this.conductor = conductor;
    }
}
