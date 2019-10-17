package com.dkbyte.project.entity;

import lombok.Data;
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

<<<<<<< HEAD

=======
    public void setPersona(PersonaEntity persona) {
        this.persona = persona;
    }
>>>>>>> 1db183e1761a95c5f95dcfba5d7e6128bdfcfd34
}
