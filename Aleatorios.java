import java.util.Random;

public class Aleatorios
{
  public static void main(String[] args)
  {
    Random numerosAleatorios = new Random(50);
    int numero;

    for (int i=1; i<=50; i++)
      {
        numero = numerosAleatorios.nextInt(21)-10;
        System.out.print(" "+numero);
      }

      double numeroDouble;
      for (int i = 1; i<=50; i++)
      {
      numeroDouble = numerosAleatorios.nextDouble()*10;
      System.out.printf("%.3f ",numeroDouble);
      }
  }
}
