import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ModelTest {


    @Test
    @DisplayName("Crear coche: se crea correctamente con modelo y matrícula")
    public void testCrearCoche() {
        Coche c = Model.crearCoche("Toyota", "ABC123");
        assertNotNull(c);
        assertEquals("Toyota", c.modelo);
        assertEquals("ABC123", c.matricula);
    }

    @Test
    @DisplayName("Buscar coche existente: devuelve el coche correcto")
    public void testGetCocheExistente() {
        Model.crearCoche("Mazda", "DEF456");
        Coche encontrado = Model.getCoche("DEF456");
        assertNotNull(encontrado);
        assertEquals("DEF456", encontrado.matricula);
    }

    @Test
    @DisplayName("Buscar coche inexistente: devuelve null")
    public void testGetCocheInexistente() {
        Coche resultado = Model.getCoche("XXX999");
        assertNull(resultado);
    }

    @Test
    @DisplayName("Cambiar velocidad: se actualiza correctamente")
    public void testCambiarVelocidad() {
        Model.crearCoche("Ford", "GHI789");
        int nuevaVelocidad = Model.cambiarVelocidad("GHI789", 80);
        assertEquals(80, nuevaVelocidad);
        assertEquals(80, Model.getVelocidad("GHI789"));
    }

    @Test
    @DisplayName("Cambiar velocidad de coche inexistente: lanza NullPointerException")
    public void testCambiarVelocidadCocheInexistente() {
        assertThrows(NullPointerException.class, () -> {
            Model.cambiarVelocidad("ZZZ000", 60);
        });
    }

    @Test
    @DisplayName("Obtener velocidad: devuelve la velocidad actual del coche")
    public void testGetVelocidad() {
        Model.crearCoche("Honda", "JKL123");
        Model.cambiarVelocidad("JKL123", 50);
        int v = Model.getVelocidad("JKL123");
        assertEquals(50, v);
    }

    @Test
    @DisplayName("Subir velocidad: aumenta en 1 correctamente")
    public void testSubirVelocidad() {
        Model.crearCoche("Kia", "MNO456");
        Model.cambiarVelocidad("MNO456", 10);
        int nuevaV = Model.subirV("MNO456");
        assertEquals(11, nuevaV);
    }

    @Test
    @DisplayName("Subir velocidad de coche inexistente: devuelve -1")
    public void testSubirVelocidadCocheInexistente() {
        int resultado = Model.subirV("NOPE999");
        assertEquals(-1, resultado);
    }

    @Test
    @DisplayName("Bajar velocidad: disminuye en 1 correctamente")
    public void testBajarVelocidad() {
        Model.crearCoche("Peugeot", "PQR789");
        Model.cambiarVelocidad("PQR789", 20);
        int nuevaV = Model.bajarV("PQR789");
        assertEquals(19, nuevaV);
    }

    @Test
    @DisplayName("Bajar velocidad de coche inexistente: devuelve -1")
    public void testBajarVelocidadCocheInexistente() {
        int resultado = Model.bajarV("NOTREAL123");
        assertEquals(-1, resultado);
    }
}
