/*
Ecuación cuadrática con mas de un public static void
Daniel Roa
A01021960
31 de agosto del 2017
*/
import java.util.Scanner;

public class formulaGeneral
{
  public static void main(String[] args)
  {
  double a, b, c, superiorpos, superiorneg, raiz, inferior;
  Scanner lectura = new Scanner(System.in);

  System.out.println("Inserta tres numeros.");

  System.out.println("Uno:");
  a = lectura.nextDouble();

  System.out.println("Dos:");
  b = lectura.nextDouble();

  System.out.println("Tres:");
  c = lectura.nextDouble();

  imprime (a, b, c);
  }
  public static void imprime (Double a, Double b, Double c)
  {
    double superiorpos, superiorneg, raiz, inferior;

    raiz = Math.sqrt((b*b)-(4*a*c));
    superiorpos = (-b + raiz);
    superiorneg = (-b - raiz);
    inferior = 2*a;

    System.out.printf("El primer numero es %f, el segundo %f y el tercero es %f. %n", a, b, c);
    System.out.printf("El valor positivo es:"+superiorpos/inferior);
    System.out.printf("El valor negativo es:"+superiorneg/inferior);
  }
}
