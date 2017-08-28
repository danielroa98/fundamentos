/*
Ejemplo de uso de métodos con edad y nombre
Daniel Roa
A01021960
28 de Agosto del 2017
*/
import java.util.Scanner;

public class Metodo2{
  public static void main(String[] args)
  {
    Scanner lector = new Scanner(System.in);
    String nombre;
    int edad;

    System.out.println("Como te llamas?");

    nombre = lector.nextLine();

    System.out.println("Cual es tu edad?");

    edad = lector.nextInt();

    imprime(nombre,edad);
  }
  public static void imprime(String nom, int ed)
  {
    System.out.printf("Hola %s tu edad es de %s.%n",nom, ed);
  }
}
