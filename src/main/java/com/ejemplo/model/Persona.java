package com.ejemplo.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.ejemplo.model.util.IntegerAdapter;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Persona {

    public Persona(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Persona() {
        this(-1, "");
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlID
    @XmlAttribute
    @XmlJavaTypeAdapter(IntegerAdapter.class)
    private Integer id;
    private String nombre;
}
