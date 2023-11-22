package modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabajadorTest {

    @Test
    public void testCrearTrabajador() {
        Trabajador trabajador = new Trabajador("John", "Doe", "12345678-9", "IsapreA", "AFP1");

        assertEquals("John", trabajador.getNombre());
        assertEquals("Doe", trabajador.getApellido());
        assertEquals("12345678-9", trabajador.getRut());
        assertEquals("IsapreA", trabajador.getIsapre());
        assertEquals("AFP1", trabajador.getAfp());
    }
}