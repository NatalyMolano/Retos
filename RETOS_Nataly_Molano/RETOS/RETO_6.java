package RETOS;
import java.util.Scanner;
import java.util.Random;
public class RETO_6 
{
    public static void main(String[]args)
    {
        int eleccion,comparar,i=0,g=0,p=0;
        double invercion,monto=0;
        boolean E=true;
        while(E==true)
        {
            i = i + 1;
            Scanner lectura = new Scanner(System.in);
            Random aleatorio = new Random();
            System.out.print("Bienvenido al juego de la moneda\nIngrese el monto que desea invertir: ");
            invercion = lectura.nextDouble();
            System.out.println("\nIngrese 1 si desea Cara\nIngrese 2 si desea Sello ");
            eleccion = lectura.nextInt();
            System.out.println("Moneda lazada");
            comparar = 1+aleatorio.nextInt(2);
            if(eleccion == comparar)
            {
                g = g + 1;
                monto = monto +(invercion * 2);
                System.out.println("Gano");
            }
            else{
                p = p+1;
                
                if (i>1)
                {
                    monto = monto-invercion;
                    System.out.println("Perdio");
                }
                else{
                    monto = 0;
                    System.out.println("Perdio");
                }
                
            }
            System.out.println("Ingrese 1 si desea seguir\nIngrese 2 si desea salir y observar el dinero acumulado");
            int opcion = lectura.nextInt();
            
            if(opcion == 2)
            {
                E=false;
            }
            
        }
        System.out.println("Cantidad de veces jugadas: " + i + " Dinero Ganado: " + monto +"\nVeces ganadas: " + g +"\nVeces perdidas: " + p );
        
    }
}
