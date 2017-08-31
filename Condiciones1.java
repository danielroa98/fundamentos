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
    Scanner lectura = new Scanner(System.in);

    System.out.println("Escriba la temperatura del auto.");

    // or se escribe ||
    // and se escribe &&
    // diferente se escribe !=
    temperatura = lectura.nextInt();

    if(temperatura>=110 || temperatura < -10)
    {
      System.out.println("Temperatura muy alta, detente por favor");
      System.out.println("Revisa el nivel de aceite.");
    }
    else
    {
      System.out.println("Todo OK. Puedes continuar.");
    }
  }
}
