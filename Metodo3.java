/*
Ejemplo de uso de métodos
Daniel Roa
A01021960
28 de Agosto del 2017
*/
import java.util.Scanner; //IMPORTACION DE LA BIBLIOTECA PARA LEER

public class Metodo3
{
  public static void main(String[] args)
  {
    System.out.println("El cuadrado de %f es %f.", 4, cuadrado(4.0));
  }
  public static double cuadrado(double numero)
  {
    double cuadrado;
    cuadrado = numero*numero;
    return cuadrado;
  }
}
