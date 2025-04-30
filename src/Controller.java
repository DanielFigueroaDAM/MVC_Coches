import java.lang.module.ModuleDescriptor;

public class Controller {
    public static void main(String[] args) {


        // Crear tres coches
        Model.crearCoche("LaFerrari", "SBC 1234");
        Model.crearCoche("Alpine", "HYU 4567");
        Model.crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = Model.getCoche("SBC 1234");
        // modifica la velocidad
        int nuevaVelocidad = miModel.cambiarVelocidad("SBC 1234", 30);

        // recoje la velocidad y la muestra (tarea de la View)
        boolean hecho = miView.muestraVelocidad("SBC 1234", miModel.getVelocidad("SBC 1234"));

        if (hecho) {
            System.out.println("Correcto");
        } else {
            System.out.println("Error");
        }
        // muestra el menu
        View.menu();

    }
    public static int recibirAumentoVelocidad(String matricula){
        int vAumentada =Model.subirV(matricula);
        if(vAumentada ==-1) {
            throw new NullPointerException("El coche no existe");
        }
        return vAumentada;
    }
    public static int recibirDisminucionVelocidad(String matricula){
        int vDisminuida =Model.bajarV(matricula);
        if(vDisminuida ==-1) {
            throw new NullPointerException("El coche no existe");
        }
        return vDisminuida;
    }
    public static int recibirVelocidad(String matricula){
        int v = Model.getVelocidad(matricula);
        return v;
    }
}