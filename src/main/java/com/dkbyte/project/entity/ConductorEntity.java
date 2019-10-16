package com.dkbyte.project.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "conductor")
public class ConductorEntity {
    @Id
    @Column(name="conductor")
    private long id;

    @ManyToOne
    @JoinColumn(name="id_persona")
    private  PersonaEntity persona;

    public PersonaEntity getPersona(){
        if(persona == null){
            persona = new PersonaEntity();
        }
        return persona;
    }
}
