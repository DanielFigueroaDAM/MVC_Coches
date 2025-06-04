public class ObserverGasolina {
    final static double LIMITE = 10.0;
    /**
     * Este es el observador de gasolina
     * @param coche Coche al que se le actualizó la gasolina
     */
    public static void update(Coche coche) {
        // verificamos si el nivel de gasolina es bajo
        if (coche.gasolina < LIMITE) {
            // avisamos de una alerta de gasolina baja
            View.alarmaGasolinaBaja(coche.matricula, coche.gasolina);
        }

}
