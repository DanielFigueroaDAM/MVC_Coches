//import static org.junit.jupiter.api.Assertions.*;
//
//import jdk.jfr.Name;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//public class ControllerTest {
//
//    Model model;
//    //cada funcion debe tener nombre
//
//    @BeforeEach
//    public void setup() {
//        model = new Model();
//        // Crear coches de prueba
//        model.crearCoche("Prueba1", "AAA111");
//        model.crearCoche("Prueba2", "BBB222");
//        model.crearCoche("Prueba3", "ZZZ999");
//
//        // Ajustar velocidades iniciales (si el modelo lo permite directamente)
//        model.cambiarVelocidad("AAA111", 50); // Coche 1 con 50 km/h
//        model.cambiarVelocidad("BBB222", 70); // Coche 2 con 70 km/h
//    }
//
//    @Test
//    @DisplayName("Enviar velocidad")
//    public void testRecibirVelocidad() {
//        int v = Controller.recibirVelocidad("AAA111");
//        assertEquals(50, v);
//    }
//
//    @Test
//    @DisplayName("Aumentar velocidad")
//    public void testRecibirAumentoVelocidad() {
//        int nuevaV = Controller.recibirAumentoVelocidad("AAA111");
//        assertTrue(nuevaV > 50); // Comprobamos que ha aumentado
//    }
//
//    @Test
//    @DisplayName("Disminuir velocidad")
//    public void testRecibirDisminucionVelocidad() {
//        int nuevaV = Controller.recibirDisminucionVelocidad("BBB222");
//        assertTrue(nuevaV < 70); // Comprobamos que ha disminuido
//    }
//
//    @Test
//    @DisplayName("Recibir velocidad de matrícula inexistente")
//    public void testRecibirVelocidadMatriculaInexistente() {
//        int v = Controller.recibirVelocidad("ZZZ999");
//        assertEquals(0, v); // Suponemos que getVelocidad devuelve 0 si no existe
//    }
//}
