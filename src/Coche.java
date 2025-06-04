public class Coche {
    String matricula;
    String modelo;
    Integer velocidad;
    Integer metros= 0;
    Double gasolina= 15.0;

    /**
     * Constructor de la clase Coche
     * @param modelo
     * @param matricula
     */
    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
    }


    /**
     * Devuelve la información del coche
     * @return String con la información del coche
     * @author Daniel Figueroa
     */
    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
