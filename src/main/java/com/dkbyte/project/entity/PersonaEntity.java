package com.dkbyte.project.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "persona")
public class PersonaEntity implements Serializable  {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name ="nombre")
    private String nombre;

    @Column(name ="apellido")
    private String apellido;

    @Column (name = "correo")
    private String correo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
