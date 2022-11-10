package RETOS;
import java.util.Scanner;
import java.util.Random;
public class RETO_4 
{
    public static void main(String[]args)
    {
        int piedra=1,papel=2,tijeras=3;
        Scanner lectura = new Scanner(System.in);
        Random aleatorio = new Random();
        int maquina,eleccion;
        System.out.println("BIENVENIDO AL JUEGO DE PIEDRA PAPEL O TIJERAS\nSeleccio 1 si desea piedra\nSeleccio 2 si desea papel\nSeleccio 3 si desea tijeras\n-------------------------------------------------------------------------------------");
        eleccion = lectura.nextInt();
        maquina = 1+aleatorio.nextInt(3);
        if(eleccion == maquina)
        {
            if (eleccion == piedra){ System.out.println("--------\nEMPATARON con piedra"); }
            else if (eleccion == papel){ System.out.println("--------\nEMPATARON con papel"); }
            else if (eleccion == tijeras){ System.out.println("--------\nEMPATARON con tijeras"); }
        }
        else if(eleccion == piedra && maquina == tijeras || eleccion == papel && maquina == piedra || eleccion == tijeras && maquina == papel  )
        {
            if (eleccion == piedra){ System.out.println("--------\nSu eleccion es piedra \nLa eleccion de la Maquina es tijeras\nFELICITACIONES GANO!!"); }
            else if (eleccion == papel){ System.out.println("--------\nSu eleccion es papel \nLa eleccion de la Maquina es piedra\nFELICITACIONES GANO!!"); }
            else if (eleccion == tijeras){ System.out.println("--------\nSu eleccion es tijeras \nLa eleccion de la Maquina es papel\nFELICITACIONES GANO!!"); }

        }
        else if(eleccion == tijeras && maquina == piedra || eleccion == piedra && maquina == papel || eleccion == papel && maquina == tijeras  )
        {
            if (maquina == piedra){ System.out.println("--------\nSu eleccion es tijeras \nLa eleccion de la Maquina es piedra\nPERDIO "); }
            else if (maquina == papel){ System.out.println("--------\nSu eleccion es piedra \nLa eleccion de la Maquina es papel\nPERDIO "); }
            else if (maquina == tijeras){ System.out.println("--------\nSu eleccion es papel \nLa eleccion de la Maquina es tijeras\nPERDIO "); }
        }

    }
    
}
