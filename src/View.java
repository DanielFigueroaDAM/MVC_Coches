import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase encargada de la interacción con el usuario
 */
public class View {
    public static Scanner sc = new Scanner(System.in);

    /**
     * Muestra el menú principal y gestiona la interacción con el usuario
     * @author Daniel Figueroa
     * @version 1.0
     */
    public static void menuPrincipal(){
        int salida=0;
        do{
            System.out.println("1. Crear coche");
            System.out.println("2. Mostrar parking");
            System.out.println("3.Cambiar velocidad");
            System.out.println("4. Avanzar metros");
            System.out.println("5. Rellenar deposito");
            System.out.println("6. Salir");
            System.out.println("Elige una opción: ");
            salida = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea
            switch (salida){
                case 1:
                    menuCrearCoche();
                    break;
                case 2:
                    mostrarParking();
                    break;
                case 3:
                    menuVelocidad();
                    break;
                case 4:
                    menuAvanzar();
                    break;
                case 5:
                    menuRellenar();
                    break;
                case 6:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while (salida != 4);
    }
    /**
     * Muestra la velocidad de un coche
     * @param matricula del coche
     * @param v velocidad
     * @return true si se ha mostrado correctamente
     */
    public static boolean muestraVelocidad(String matricula, Integer v){
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }
    /**
     * Muestra el menú para crear un coche
     * @author Daniel Figueroa
     * @version 1.0
     */
    public static void menuCrearCoche(){
        int salida=0;
        do{
            System.out.println("1. Crear coche");
            System.out.println("2. Salir");
            System.out.println("Elige una opción: ");
            salida = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea
            switch (salida){
                case 1:
                    System.out.println("Dime el modelo del coche: ");
                    String modelo = sc.nextLine();
                    sc.nextLine(); // Consumir el salto de línea
                    System.out.println("Dime la matricula del coche: ");
                    String matricula = sc.nextLine();
                    Coche c1= Controller.recibirCrearCoche(modelo, matricula);
                    mostrarCoche(c1);
                    break;
                case 2:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while (salida != 2);
    }
    /**
     * Muestra un coche
     * @param c1 coche a mostrar
     */

    private static void mostrarCoche(Coche c1) {
        if(c1 != null) {
            System.out.println("Coche creado: " + c1);
        } else {
            System.out.println("Error al crear el coche");
        }
    }
    /**
     * Muestra el menú para cambiar la velocidad de un coche
     * @author Daniel Figueroa
     * @version 1.0
     */
    public static void menuVelocidad() {
        int opcion;
        do {
            System.out.println("Dime la matricula del coche: ");
            String matricula = sc.nextLine();
            sc.nextLine(); // Consumir el salto de línea
            System.out.println("1. Aumentar velocidad");
            System.out.println("2. Disminuir velocidad");
            System.out.println("3. Mostrar velocidad");
            System.out.println("4. Salir");
            System.out.println("Elige una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    int volocidadCambiada = Controller.recibirAumentoVelocidad(matricula);
                    System.out.println("La velocidad del coche es: " + volocidadCambiada);
                    break;
                case 2:
                    int volocidadCambiada2 = Controller.recibirDisminucionVelocidad(matricula);
                    System.out.println("La velocidad del coche es: " + volocidadCambiada2);
                    break;
                case 3:
                    int volocidadCambiada3 = Controller.recibirVelocidad(matricula);
                    System.out.println("La velocidad del coche es: " + volocidadCambiada3);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 4);
    }
    /**
     * Muestra el parking
     * @author Daniel Figueroa
     * @version 1.0
     */
    public static void mostrarParking(){
        ArrayList<Coche> parking = Controller.recibirParking();
        for (Coche c: parking) {
            mostrarCoche(c);
        }
    }
    /**
     * Muestra el menú para avanzar metros
     * @author Daniel Figueroa
     * @version 1.0
     */
    public static void menuAvanzar() {
        System.out.println("Dime la matricula del coche: ");
        String matricula = sc.nextLine();
        sc.nextLine(); // Consumir el salto de línea
        System.out.println("Dime los metros que quieres avanzar: ");
        int metros = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea
        String resultado = Controller.recibirDistanciaAvanzada(matricula, metros);
    }
    /**
     * Muestra el menú para rellenar el depósito
     * @author Daniel Figueroa
     * @version 1.0
     */
    public static void menuRellenar() {
        System.out.println("Dime la matricula del coche: ");
        String matricula = sc.nextLine();
        sc.nextLine(); // Consumir el salto de línea
        System.out.println("Dime los litros que quieres rellenar: ");
        double litros = sc.nextDouble();
        double litrosTotales = Controller.recibirReposicion(matricula, litros);
        System.out.println(" Litros totales en el depósito: " + litrosTotales);
    }
    /**
     * Muestra una alarma de infracción
     * @param matricula del coche
     * @param velocidad del coche
     */
    public static boolean alarmaInfraccion(String matricula) {
        System.out.println("ALERTA: repostar gasolina de coche: " + matricula);
        return true;
    }




}
