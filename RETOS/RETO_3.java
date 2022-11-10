package RETOS;
import java.util.Scanner;
import java.util.Random;
public class RETO_3 {
    public static void main(String[]args)
    {
        int eleccion,comparar;
        Scanner lectura = new Scanner(System.in);
        Random aleatorio = new Random();
        System.out.println("Bienvenido al juego de la moneda\nIngrese 1 si desea Cara\nIngrese 2 si desea Sello ");
        eleccion = lectura.nextInt();
        System.out.println("Moneda lazada");
        comparar = 1+aleatorio.nextInt(2);
        if(eleccion == comparar)
        {
            System.out.println("Gano");
        }
        else{
            System.out.println("Perdio");
        }
    }
}
