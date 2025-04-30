//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//public class ModelTest {
//
//    Model model;
//
//    @BeforeEach
//    public void setUp() {
//        model = new Model();
//        Model.parking.clear(); // limpiar el parking antes de cada test
//    }
//
//    @Test
//    @DisplayName("Crear coche: se crea correctamente con modelo y matrícula")
//    public void testCrearCoche() {
//        Coche c = model.crearCoche("Toyota", "ABC123");
//        assertNotNull(c);
//        assertEquals("Toyota", c.modelo);
//        assertEquals("ABC123", c.matricula);
//    }
//
//    @Test
//    @DisplayName("Buscar coche existente: devuelve el coche correcto")
//    public void testGetCocheExistente() {
//        model.crearCoche("Mazda", "DEF456");
//        Coche encontrado = model.getCoche("DEF456");
//        assertNotNull(encontrado);
//        assertEquals("DEF456", encontrado.matricula);
//    }
//
//    @Test
//    @DisplayName("Buscar coche inexistente: devuelve null")
//    public void testGetCocheInexistente() {
//        Coche resultado = model.getCoche("XXX999");
//        assertNull(resultado);
//    }
//
//    @Test
//    @DisplayName("Cambiar velocidad: se actualiza correctamente")
//    public void testCambiarVelocidad() {
//        model.crearCoche("Ford", "GHI789");
//        int nuevaVelocidad = model.cambiarVelocidad("GHI789", 80);
//        assertEquals(80, nuevaVelocidad);
//        assertEquals(80, model.getVelocidad("GHI789"));
//    }
//
//    @Test
//    @DisplayName("Cambiar velocidad de coche inexistente: lanza NullPointerException")
//    public void testCambiarVelocidadCocheInexistente() {
//        assertThrows(NullPointerException.class, () -> {
//            model.cambiarVelocidad("ZZZ000", 60);
//        });
//    }
//
//    @Test
//    @DisplayName("Obtener velocidad: devuelve la velocidad actual del coche")
//    public void testGetVelocidad() {
//        model.crearCoche("Honda", "JKL123");
//        model.cambiarVelocidad("JKL123", 50);
//        int v = model.getVelocidad("JKL123");
//        assertEquals(50, v);
//    }
//
//    @Test
//    @DisplayName("Subir velocidad: aumenta en 1 correctamente")
//    public void testSubirVelocidad() {
//        model.crearCoche("Kia", "MNO456");
//        model.cambiarVelocidad("MNO456", 10);
//        int nuevaV = model.subirV("MNO456");
//        assertEquals(11, nuevaV);
//    }
//
//    @Test
//    @DisplayName("Subir velocidad de coche inexistente: devuelve -1")
//    public void testSubirVelocidadCocheInexistente() {
//        int resultado = model.subirV("NOPE999");
//        assertEquals(-1, resultado);
//    }
//
//    @Test
//    @DisplayName("Bajar velocidad: disminuye en 1 correctamente")
//    public void testBajarVelocidad() {
//        model.crearCoche("Peugeot", "PQR789");
//        model.cambiarVelocidad("PQR789", 20);
//        int nuevaV = model.bajarV("PQR789");
//        assertEquals(19, nuevaV);
//    }
//
//    @Test
//    @DisplayName("Bajar velocidad de coche inexistente: devuelve -1")
//    public void testBajarVelocidadCocheInexistente() {
//        int resultado = model.bajarV("NOTREAL123");
//        assertEquals(-1, resultado);
//    }
//}
