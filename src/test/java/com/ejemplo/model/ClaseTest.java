package com.ejemplo.model;

import java.util.ArrayList;

import com.ejemplo.model.util.XMLParser;

import org.junit.jupiter.api.Test;

public class ClaseTest {

    @Test
    public void testMarshall() {
        Profesor profesor = new Profesor(1, "Juan Carlos");
        Estudiante e1 = new Estudiante(2, "Francisco Arguedas");
        Estudiante e2 = new Estudiante(3, "AreAre");
        Clase clase = new Clase(42, profesor, new ArrayList<>());
        clase.getEstudiantes().add(e1);
        clase.getEstudiantes().add(e2);
        XMLParser.marshall(clase, "clase-test.xml");
    }

    @Test
    public void testUnmarshall(){
        XMLParser.marshall(new Clase(), "clase-test.xml");
        Clase clase = (Clase) XMLParser.unmarshall(new Clase(), "clase-test.xml");
        assert(clase != null);
    }
}
