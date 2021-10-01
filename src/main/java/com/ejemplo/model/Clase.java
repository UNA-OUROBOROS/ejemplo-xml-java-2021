package com.ejemplo.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.ejemplo.model.util.IntegerAdapter;




@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Clase {

    public Clase(Integer idClase, Profesor profesor, List<Estudiante> estudiantes) {
        this.idClase = idClase;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }

    public Clase() {
        this(-1, new Profesor(), new ArrayList<>());
    }

    public Integer getIdClase() {
        return idClase;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @XmlID
    @XmlAttribute
    @XmlJavaTypeAdapter(IntegerAdapter.class)
    private Integer idClase;
    private Profesor profesor;
    @XmlElementWrapper
    @XmlElement
    private List<Estudiante> estudiantes;
}
