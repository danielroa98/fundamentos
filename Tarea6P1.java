/*
Daniel Roa
A01021960
Tarea 6, Pregunta 1
Arreglos
*/
import java.util.Scanner;

public class Tarea6P1
{
  public static void main(String[] args)
  {
    int[] arreglo ={41,25,105,874,75,65};
    int[] arreglo2 ={54,87,21,45,894,145};
    int arre = 0; int arre2 = 0;

    for (int primero:arreglo)
     {
       for (int segundo:arreglo2)
       {
         arre = primero;
         arre2 = segundo;

         System.out.printf("(%d,%d)",arre, arre2);
       }
    }

    System.out.println("Numeros guardados actualmente: "+arreglo);

  }
  /*
  C:\Users\danie\Favorites\Programacion\Fundamentos>java Tarea6P1
(41,54)(41,87)(41,21)(41,45)(41,894)(41,145)(25,54)(25,87)(25,21)(25,45)(25,894)(25,145)(105,54)(105,87)(105,21)(105,45)(105,894)(105,145)(874,54)(874,87)(874,21)(874,45)(874,894)(874,145)(75,54)(75,87)(75,21)(75,45)(75,894)(75,145)(65,54)(65,87)(65,21)(65,45)(65,894)(65,145)
*/
}
