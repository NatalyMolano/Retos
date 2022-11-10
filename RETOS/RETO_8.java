package RETOS;
import java.util.Scanner;
public class RETO_8 
{
    public static void main(String[]args)
    {   
        Scanner lectura = new Scanner(System.in);
        int filas = 4, columnas = 4;
        String [][]  maquina;
        int [][] precio;
        maquina = new String[filas][columnas];
        precio = new int[filas][columnas];
        System.out.println("BIENVENIDO A LA MAQUINA DE DULCES");
        for(int f =0; f < filas;f++)
        {
            for(int c =0; c< columnas;c++)
            {
                System.out.println("Ingrese nombre del producto que se encuentra en la fila "+ f + " columna " + c);
                maquina[f][c] = lectura.next();
                System.out.println("Ingrese el precio del producto " + maquina[f][c] +" que se encuentra en la fila "+ f + " columna " + c);
                precio[f][c] = lectura.nextInt();
                
            }
            
        }
        
        for (int x=0; x < maquina.length; x++) 
        {  
            System.out.println(" ");
            for (int y=0; y < maquina[x].length; y++) 
            { 
                System.out.print("| posicion "+x+y+" producto "+maquina[x][y] +"  precio "+precio[x][y]+" |");
                
            }
        }
       


    }
    
}
