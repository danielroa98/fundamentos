/*
Daniel Roa
A01021960
Tarea 6, Pregunta 3
Arreglos
*/
import java.util.Scanner;

public class Tarea6P3
{
  public static void main(String[] args)
  {
    int[] arreglo ={41,25,105,874,75,65};
    int enter1, enter2;

    for (enter1 = 0 ; enter1<arreglo.length; enter1++)
     {
       enter2=1;
       enter2++;

       if (arreglo[enter1]==arreglo[enter2])
      {
        System.out.printf("El valor repetido es: %d.%n",arreglo[enter1]);
       }
       else
       {
         System.out.printf("No se repite ningun valor en:%d.%n",enter1);
       }
    }
    /*
    C:\Users\danie\Favorites\Programacion\Fundamentos>java Tarea6P3
No se repite ningun valor en:0.
No se repite ningun valor en:1.
El valor repetido es: 105.
No se repite ningun valor en:3.
No se repite ningun valor en:4.
No se repite ningun valor en:5.
*/
  }
}
