package RETOS;
import java.util.Scanner;
public class RETO_2 {
    public static void main(String [] args)
    {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese los meses del bebe ");
        double edad = lectura.nextDouble();
        System.out.println("Ingrese el peso del bebe ");
        double peso = lectura.nextDouble();
        double dosisvacuna = ((peso + 10) / (edad * 10)) * 8;
        System.out.println("Dosis de vacunas: " + dosisvacuna);
    }
    
}
