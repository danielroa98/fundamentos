/*
Ejemplo de uso de condiciones
Daniel Roa
*/
import java.util.Scanner;

public class Condiciones1
{
  public static void main(String[] args)
  {
    int temperatura;
    String salida;
    Scanner lectura = new Scanner(System.in);

    System.out.println("Escriba la temperatura del auto.");

    // or se escribe ||
    // and se escribe &&
    // diferente se escribe !=
    temperatura = lectura.nextInt();

    if(temperatura < -10)
    {
      System.out.println("Temperatura muy baja.");
    }
    else if(temperatura >= -10 && temperatura <= 110)
    {
      System.out.println("Todo OK. Puedes continuar.");
    }
    if(temperatura>110)
    {
      System.out.println("Temperatura muy alta, detente por favor");
      System.out.println("Revisa el nivel de aceite.");
    }

    lectura.nextLine();
    System.out.println("Escribe s para salir");
    salida = lectura.nextLine();
    if(salida.equals("s"))
    {System.out.println("Adios!");}
  }
}
