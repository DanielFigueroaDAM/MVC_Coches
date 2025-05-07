import java.util.Scanner;

/**
 * Clase encargada de la interacción con el usuario
 */
public class View {
    public static Scanner sc = new Scanner(System.in);
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
            switch (salida){
                case 1:
                    System.out.println("Dime el modelo del coche: ");
                    String modelo = sc.nextLine();
                    sc.nextLine(); // Consumir el salto de línea
                    System.out.println("Dime la matricula del coche: ");
                    String matricula = sc.nextLine();
                    System.out.println(Controller.recibirCrearCoche(modelo, matricula));
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
    public static void menuVelocidad(){
        System.out.println("Dime la matricula del coche: ");
        String matricula = sc.nextLine();
        sc.nextLine(); // Consumir el salto de línea
        System.out.println("1. Aumentar velocidad");
        System.out.println("2. Disminuir velocidad");
        System.out.println("3. Mostrar velocidad");
        System.out.println("4. Salir");
        System.out.println("Elige una opción: ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                int volocidadCambiada= Controller.recibirAumentoVelocidad(matricula);
                System.out.println("La velocidad del coche es: " + volocidadCambiada);
                break;
            case 2:
                int volocidadCambiada2= Controller.recibirDisminucionVelocidad(matricula);
                System.out.println("La velocidad del coche es: " + volocidadCambiada2);
                break;
            case 3:
                int volocidadCambiada3= Controller.recibirVelocidad(matricula);
                System.out.println("La velocidad del coche es: " + volocidadCambiada3);
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
