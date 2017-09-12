/*
Resolución de una ecuación cuadrática por Humberto Reynoso A01022188;
"El programa en cuestión pide los valores de A, B y C (que corresponden a
los coeficientes de la ecuación Ax^2+Bx+C); consecuentemente se arrojan
los valores de X sin importar que estos abarquen el campo de los números
imaginarios."
*/
import java.util.Scanner;
  public class Ecuacion_Cuadratica
  {
    public static void main(String[] args)
    {
        double A,B,C,SQRT,discriminante,X1,X2;

        Scanner stdIn = new Scanner (System.in);

        System.out.println("Valor de A:");
        A= stdIn.nextInt();

        System.out.println("Valor de B:");
        B= stdIn.nextInt();

        System.out.println("Valor de C:");
        C= stdIn.nextInt();

        double discriminante = B * B - 4 * A * C;

        if(discriminante > 0)
        {
            X1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            X2 = (-B - Math.sqrt(discriminante)) / (2 * A);

            System.out.format("X1 = %.2f y X2 = %.2f", X1 ,X2);
        }

        else if(discriminante == 0)
        {
            X1 = X2 = -B / (2 * A);

            System.out.format("X1 = X2 = %.2f;", X1);
        }

        else
        {
            double partereal = -B / (2 *A);
            double parteimaginaria = Math.sqrt(-discriminante) / (2 * A);

            System.out.format("X1 = %.2f+%.2fi y X2 = %.2f-%.2fi", partereal, parteimaginaria, partereal, parteimaginaria);
        }
}
