import java.util.Scanner;

public class Practica1
{
  public static void main(String[] args)
  {
    Scanner lectura = new Scanner(System.in);
    double p, q, p_al_cubo, q_ala_cuarta, dosp, resultado;

    System.out.println("Inserta un valor para p");
    p = lectura.nextInt();

    System.out.println("Inserta un valor para q");
    q = lectura.nextInt();

    p_al_cubo = p*p*p;
    q_ala_cuarta = q*q*q*q;
    dosp = 2*(p*p);

    resultado = p_al_cubo + q_ala_cuarta - dosp;

    if(resultado<680)
    
      System.out.printf("El resultado es menor %f%n",resultado);

  }
}
