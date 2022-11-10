package RETOS;
import java.util.Scanner;
public class RETO_1 {
    public static void main(String [] args)
    {
        Scanner lectura = new Scanner(System.in);
        //RETO 1
        System.out.println("Ingrese la temperatura F°");
        double F = lectura.nextDouble();
        double C = (F - 32) / 1.8;
        System.out.println("Temperatura a C° " + Math.round(C));
    }
}
