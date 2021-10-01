package com.ejemplo.model;

import com.ejemplo.model.util.XMLParser;

import org.junit.jupiter.api.Test;

public class ProfesorTest {
    @Test
    public void testMarshall() {
        Profesor profesor = new Profesor(1, "Juan Carlos");
        XMLParser.marshall(profesor, "profesor-test.xml");
    }

    @Test
    public void testUnmarshall(){
        XMLParser.marshall(new Profesor(), "profesor-test.xml");
        Profesor profesor = (Profesor) XMLParser.unmarshall(new Profesor(), "profesor-test.xml");
        assert(profesor != null);
    }
}
