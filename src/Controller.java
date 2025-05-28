import java.util.ArrayList;

public class Controller {
    /**
     * Controlador de la aplicación
     *
     * @author Daniel Figueroa
     * @version 1.0
     */
    public static void Controler() {


        // Crear tres coches
        Model.crearCoche("LaFerrari", "SBC 1234");
        Model.crearCoche("Alpine", "HYU 4567");
        Model.crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = Model.getCoche("SBC 1234");
        // modifica la velocidad
        int nuevaVelocidad = Model.cambiarVelocidad("SBC 1234", 30);

        // recoje la velocidad y la muestra (tarea de la View)
        boolean hecho = View.muestraVelocidad("SBC 1234", Model.getVelocidad("SBC 1234"));

        if (hecho) {
            System.out.println("Correcto");
        } else {
            System.out.println("Error");
        }
        // muestra el menu
        View.menuVelocidad();

    }

    /**
     * Recibe la velocidad de un coche
     *
     * @param matricula del coche
     * @return velocidad del coche
     * @author Daniel Figueroa
     */
    public static int recibirAumentoVelocidad(String matricula) {
        int vAumentada = Model.subirV(matricula);
        if (vAumentada == -1) {
            throw new NullPointerException("El coche no existe");
        }
        return vAumentada;
    }

    /**
     * Recibe la disminucion de velocidad de un coche
     *
     * @param matricula del coche
     * @return velocidad del coche
     * @author Daniel Figueroa
     */
    public static int recibirDisminucionVelocidad(String matricula) {
        int vDisminuida = Model.bajarV(matricula);
        if (vDisminuida == -1) {
            throw new NullPointerException("El coche no existe");
        }
        return vDisminuida;
    }

    /**
     * Recibe la velocidad de un coche
     *
     * @param matricula del coche
     * @return velocidad del coche
     * @author Daniel Figueroa
     */
    public static int recibirVelocidad(String matricula) {
        int v = Model.getVelocidad(matricula);
        return v;
    }

    /**
     * Recibe la creación de un coche
     *
     * @param modelo    del coche
     * @param matricula del coche
     * @return coche creado
     * @author Daniel Figueroa
     */
    public static Coche recibirCrearCoche(String modelo, String matricula) {
        Coche c = Model.crearCoche(modelo, matricula);
        return c;
    }

    /**
     * Recibe el parking, es decir, la lista de coches que es un ArrayList
     *
     * @return parking
     * @author Daniel Figueroa
     */
    public static ArrayList<Coche> recibirParking() {
        ArrayList<Coche> parking = Model.getParking();
        return parking;
    }

    /**
     * Recibe la distancia avanzada de un coche
     *
     * @param matricula del coche
     * @param metros    distancia a avanzar
     * @return String con la distancia avanzada
     * @author Daniel Figueroa
     */
    public static String recibirDistanciaAvanzada(String matricula, int metros) {
        String resultado = Model.avanzar(matricula, metros);
        return resultado;
    }

    /**
     * Recibe la reposición de combustible de un coche
     *
     * @param matricula del coche
     * @param litros    cantidad de litros a reponer
     * @return cantidad de litros repuestos
     * @author Daniel Figueroa
     */
    public static double recibirReposicion(String matricula, double litros) {
        double gasolinaTotal = Model.rellenar(matricula, litros);
        return gasolinaTotal;
    }
}