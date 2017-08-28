/*
Ejemplo de uso de métodos
Daniel Roa
A01021960
28 de Agosto del 2017
*/
import java.util.Scanner;

public class Metodo1
{
  public static void main(String[] args)
  {
    String nombre = "Daniel";
    String otroNombre = "Juanito";

    Scanner lector = new Scanner(System.in);


    nombre = lector.nextLine();

    imprime(nombre);

    System.out.println("Entre llamadas al metodo");

    imprime(otroNombre);
  }
    public static void imprime(String a)
    {
      System.out.printf("Hola %s desde el metodo. %n", a);

    }
}
