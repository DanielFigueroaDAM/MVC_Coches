import java.util.ArrayList;

/**
 * Clase encargada de manejar los datos
 */
public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();
    private int velocidad=0;

    /**
     * Crea un coche y lo mete en el parking
     * @param modelo del coche
     * @param matricula identificador unico
     * @return el coche creado
     */


    /**
     * Busca coche segun matricula
     * @param matricula a buscar
     * @author Daniel Figueroa
     * @return chche o null si no existe
     */
    public static Coche getCoche(String matricula){
        Coche aux = null;
        // recorre el array buscando por matricula
        for (Coche e: parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }

    /**
     * Cambia la velocidad de un coche
     * @param matricula
     * @param v nueva velocidad
     * @author Daniel Figueroa
     * @return velocidad modificada
     */
    public static int cambiarVelocidad(String matricula, Integer v) {
        // busca el coche
        getCoche(matricula).velocidad = v;
        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }

    /**
     * Ddevuelve la velocidad segun la matricula
     * @param matricula
     * @author Daniel Figueroa
     * @return
     */
    public static int getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }
    public static int subirV(String matricula){
        Coche aux = getCoche(matricula);
        if (aux != null) {
            aux.velocidad += 1;
            return aux.velocidad;
        } else {
            return -1; // coche no encontrado
        }
    }
    /**
     * Baja la velocidad de un coche
     * @param matricula
     * @author Daniel Figueroa
     * @return
     */
    public static int bajarV(String matricula){
        Coche aux = getCoche(matricula);
        if (aux != null) {
            aux.velocidad -= 1;
            return aux.velocidad;
        } else {
            return -1; // coche no encontrado
        }
    }
    /**
     * Crea un coche y lo añade al parking
     * @param modelo del coche
     * @param matricula identificador unico
     * @author Daniel Figueroa
     * @return el coche creado
     */
    public static Coche crearCoche(String modelo, String matricula) {
        Coche c = new Coche(modelo, matricula);
        parking.add(c);
        return c;
    }
    /**
     * Devuelve el parking
     * @author Daniel Figueroa
     * @return
     */
    public static ArrayList<Coche> getParking() {
        return parking;
    }
}
