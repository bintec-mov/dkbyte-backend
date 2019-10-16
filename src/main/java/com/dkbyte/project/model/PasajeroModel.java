package com.dkbyte.project.model;

import lombok.Data;

@Data
public class PasajeroModel extends PersonaModel{
    private long id;
    private PersonaModel persona;

    public PersonaModel getPersona(){
        if(persona == null){
            persona = new PersonaModel();
        }
        return persona;
    }

}
