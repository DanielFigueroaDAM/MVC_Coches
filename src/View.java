import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase encargada de la interacción con el usuario
 */
public class View {
    public static Scanner sc = new Scanner(System.in);

    public static void menuPrincipal(){
        int salida=0;
        do{
            System.out.println("1. Crear coche");
            System.out.println("2. Mostrar parking");
            System.out.println("3.Cambiar velocidad");
            System.out.println("3. Salir");
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

    private static void mostrarCoche(Coche c1) {
        if(c1 != null) {
            System.out.println("Coche creado: " + c1);
        } else {
            System.out.println("Error al crear el coche");
        }
    }

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
    public static void mostrarParking(){
        ArrayList<Coche> parking = Controller.recibirParking();
        for (Coche c: parking) {
            mostrarCoche(c);
        }
    }

}
