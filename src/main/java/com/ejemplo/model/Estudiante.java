package com.ejemplo.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Estudiante extends Persona {

    public Estudiante(Integer id, String nombre) {
        super(id, nombre);
    }

    public Estudiante() {
    }

}
