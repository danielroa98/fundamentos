/*
TAREA Ecuación Cuadrática
Daniel Roa
A01021960
29 de Agosto del 2017
*/
import java.util.Scanner; //IMPORTACION DE LA BIBLIOTECA PARA LEER

public class Metodo3
{
  public static void main(String[] args)
  {
    double numero1, numero2, numero3, cuadrado; //= cuadrado();
    //double ;

    Scanner lectura = new Scanner(System.in);


    System.out.println("Escribe tres numeros:");

    System.out.println("Uno:");
    numero1 = Double.parseDouble(args [0]);

    System.out.println("Dos:");
    numero2 = Double.parseDouble(args[1]);

    System.out.println("Tres:");
    numero3 = Double.parseDouble(args[2]);


    System.out.printf("El cuadrado de %f es %f %n", cuadrado(4.0));
    System.out.printf("%.2f",numero1);
  }
  public static double cuadrado(double numero)
  {
    double cuadrado;
    cuadrado = numero2*numero2;
    return cuadrado;
  }
  public static double multiplicacion(double numero)
  {

  }
  public static double division(double numero)
  {

  }
}
