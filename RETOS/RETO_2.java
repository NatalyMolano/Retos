package RETOS;
import java.util.Scanner;
public class RETO_2 {
    public static void main(String [] args)
    {
        double edad,peso,dosisvacuna;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese los meses del bebe ");
        edad = lectura.nextDouble();
        System.out.println("Ingrese el peso del bebe ");
        peso = lectura.nextDouble();
        dosisvacuna = ((peso + 10) / (edad * 10)) * 8;
        System.out.println("Dosis de vacunas: " + dosisvacuna);
    }
    
}
