package com.ejemplo.model;

import com.ejemplo.model.util.XMLParser;

import org.junit.jupiter.api.Test;

public class PersonaTest {

    @Test
    public void testMarshall() {
        Persona persona = new Persona(1, "Juan Carlos");
        XMLParser.marshall(persona, "persona-test.xml");
    }

    @Test
    public void testUnmarshall(){
        XMLParser.marshall(new Persona(), "persona-test.xml");
        Persona persona = (Persona) XMLParser.unmarshall(new Persona(), "persona-test.xml");
        assert(persona != null);
    }
}
