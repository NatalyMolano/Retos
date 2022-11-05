package RETOS;
import java.util.Scanner;
public class RETO_5 
{
    
    public static void main(String[]args)
    {
        int cantidad,i;
        double p=0, suma =0;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese la catidad de productos que va a comprar");
        cantidad = lectura.nextInt();
        for (i = 1;i <= cantidad;i++)
        {
            System.out.println("Ingrese el precio del producto "+i);
            p = lectura.nextDouble();
            suma = suma + p;
            
        }

        System.out.println("En total compro: " + cantidad+ "productos \nTotal a pagar es de: " +suma);
    }
    
}
