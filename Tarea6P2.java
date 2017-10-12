/*
Daniel Roa
A01021960
Tarea 6, Pregunta 2
Arreglos
*/
import java.util.Scanner;

public class Tarea6P2
{
    public static void main(String[] args)
    {
      Scanner lectura = new Scanner(System.in);
      int[] arreglo ={41,25,105,874,75,65};
      int enter, val;

      System.out.println("En que posicion del arreglo quiere buscar el valor?");
      enter = lectura.nextInt();

      for (val=0; val<arreglo.length; val++)
      {

        if(arreglo[val]==enter)
        {
          System.out.printf("El digito esta en %d.%n",val);
        }
        else if (arreglo[val]!=enter)
        {
            System.out.println("Este valor es inexistente");
        }
      }
    }
    /*
    C:\Users\danie\Favorites\Programacion\Fundamentos>java Tarea6P2
En que posicion del arreglo quiere buscar el valor?
5
Este valor es inexistente
Este valor es inexistente
Este valor es inexistente
Este valor es inexistente
Este valor es inexistente
Este valor es inexistente
*/
}
