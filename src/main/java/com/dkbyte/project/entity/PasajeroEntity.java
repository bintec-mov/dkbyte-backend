package com.dkbyte.project.entity;

import lombok.Data;
import org.springframework.security.core.parameters.P;
import javax.persistence.*;

@Data
@Entity
@Table(name = "pasajero")
public class PasajeroEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name="id_persona")
    private PersonaEntity persona;

    public PersonaEntity getPersona(){
        if(persona == null){
            persona = new PersonaEntity();
        }
        return persona;
    }
}
