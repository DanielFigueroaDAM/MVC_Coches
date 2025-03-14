import java.util.Scanner;

public class multiplos {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int sumaTotal=0,numero;
        for (int i=0;i<10;i++){
            System.out.println("Escribe el numero");
            numero=teclado.nextInt();
            if(i>=5){
                sumaTotal=sumaTotal+numero;
            }

        }
        System.out.println("La suma total es "+sumaTotal);
    }
}
