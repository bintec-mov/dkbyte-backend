package com.dkbyte.project.entity;

import lombok.Data;
import org.springframework.security.core.parameters.P;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "pasajero")
public class PasajeroEntity implements Serializable {
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPersona(PersonaEntity persona) {
        this.persona = persona;
    }
}
