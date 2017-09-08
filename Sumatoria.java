import java.util.Scanner;

public class Sumatoria
{
  public static void main(String[] args)
  {
    int numero;
    Scanner lectura = new Scanner(System.in);

    System.out.println("Inserta un numero");
    numero = lectura.nextInt();

    System.out.printf("La sumatoria es %d%n", sumatoria(numero) );

      System.out.printf("\nEl factorial es %d%n", factorial(numero) );

  }
    public static int sumatoria(int num)
    {
    int contador = 0;
    int suma = 0;
    while(contador<=num)
    {
      suma = suma + contador;
      contador++;

    }
    return suma;
  }
    public static int factorial(int num)
    {
      int contador = 1;
      int fact = 1;
      while(contador<=num)
      {
        fact *= contador;   //fact = fact*contador
        contador++;
      }
      return fact;
    }
}
