/*
Ejemplo de uso de métodos
Daniel Roa
A01021960
28 de Agosto del 2017
*/
public class Metodo1
{
  public static void main(String[] args)
  {
    String nombre = "Daniel";

    imprime(nombre);

    System.out.println("Entre llamadas al metodo");

    imprime("Juanito");
  }
    public static void imprime(String nom)
    {
      System.out.printf("Hola %s desde el metodo. %n", nom);
    }
}
