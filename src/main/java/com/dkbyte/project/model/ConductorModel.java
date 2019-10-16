package com.dkbyte.project.model;

import com.dkbyte.project.entity.PersonaEntity;
import lombok.Data;

@Data
public class ConductorModel extends PersonaModel {
    private long id;
    private PersonaEntity persona;

    public PersonaEntity getPersona(){
        if(persona == null){
            persona = new PersonaEntity();
        }
        return persona;
    }

}
