package com.ejemplo.model;

import com.ejemplo.model.util.XMLParser;

import org.junit.jupiter.api.Test;

public class EstudianteTest {
    @Test
    public void testMarshall() {
        Estudiante estudiante = new Estudiante(1, "Juan Carlos");
        XMLParser.marshall(estudiante, "estudiante-test.xml");
    }

    @Test
    public void testUnmarshall(){
        XMLParser.marshall(new Clase(), "estudiante-test.xml");
        Estudiante estudiante = (Estudiante) XMLParser.unmarshall(new Estudiante(), "estudiante-test.xml");
        assert(estudiante != null);
    }
}
