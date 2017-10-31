/*
Daniel Roa
A01021960
Arreglos Bidimensionales 10*10
*/
import java.util.Random;

public class ArreglosBidimensionales2
{
  public static void main(String[] args)
  {
    int[][] matriz = new int[10][10];
    Random aleatorio = new Random();

    for (int renglones = 0; renglones<matriz.length; renglones++)
      {
        for (int columnas = 0; columnas<matriz[renglones].length; columnas++)
        {
          matriz[renglones][columnas] = aleatorio.nextInt(100) +1;
          System.out.printf("%d\t",matriz[renglones][columnas]);
        }
        System.out.println();
      }

      System.out.println("La suma de los pares del primer renglon.");
      for (int i=0; i<matriz.length-1; i++)
      {
        System.out.printf("%d\t",matriz[0][i]+matriz[0][i+1]);

      }
    }
  }
