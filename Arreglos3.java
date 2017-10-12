/*
Daniel Roa
A01021960
Arreglos Bidimensionales 10*10
*/
import java.util.Random;

public class Arreglos3
{
  public static void main(String[] args)
  {
    int[][] matriz = new int[10][10];
    Random aleatorio = new Random();

    for (int renglones = 0; renglones<matriz.length; renglones++)
      {
        for (int columnas = 0; columnas<matriz[0].length; columnas++)
        {
          matriz[renglones][columnas] = aleatorio.nextInt(100) +1;
          System.out.printf("%d\t",matriz[renglones][columnas]);
        }
        System.out.println();
      }
    }
  }
