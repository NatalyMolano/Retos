package RETOS;
import java.util.Scanner;
import java.lang.*;;
public class RETO_7 
{
    public static void main(String[]args)
    {   
        Scanner lectura = new Scanner(System.in);
        /*RETO_7 NOTAS */
        /*int n,i;
        double resultado=0,suma=0;
        double [] notas;
        System.out.println("Ingrese la cantidad de notas las cuales va a calcular el promedio");
        n = lectura.nextInt();
        notas = new double[n];
        for(i=0; i < n; i++)
        {
            System.out.println("Ingrese la nota " + i);
            notas[i] = lectura.nextDouble();
            suma+= notas[i];
        }
        resultado = suma / n;
        System.out.println("Promedio de las notas: " + resultado);
        if (resultado <3){System.out.println("Reprobaste");}
        else if (resultado >3 && resultado< 4 ){System.out.println("Pasaste raspando");}
        else{System.out.println("Pasaste con buenos resultados");}*/
        
        
        /*RETO_7 COMPETENCIA */
        
        int cantidad,i,c, resultado=0,p;
        int minValue = Integer.MAX_VALUE;/*Constante en la clase Integer almacena el valor máximo posible para cualquier variable entera en Java*/
        String [] nombre;
        int [] tiempo;
        System.out.println("\nBIENVENIDOS A LA COMPETENCIA DE NATACION\nIngrese la cantidad de competidores");
        cantidad = lectura.nextInt();
        nombre = new String[cantidad];
        tiempo = new int[cantidad];
        for(i=0; i < cantidad; i++)
        {
            c = i+1 ;
            System.out.println("Ingrese el nombre de competidor " + c);
            nombre[i] = lectura.next();
            System.out.println("Ingrese el tiempo en minutos de el competidor " + nombre[i]);
            tiempo[i] = lectura.nextInt();
        }
        for(p =0; p < tiempo.length;p++)
        {
            if (tiempo[p]< minValue)
            {
                minValue = tiempo[p];
            }
            System.out.print("|Nombre: "+nombre[p]+" tiempo "+ tiempo[p] +" minutos |");
            if (tiempo[p] == minValue)
            {
                resultado = p;
            }

        }
        System.out.println("\nEl ganador por realizar la competencia en el menor tiempo es: "+ nombre[resultado]);
        
        

    }
    
}
