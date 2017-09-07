import java.util.Scanner;

public class While1
{
  public static void main(String[] args)
  {
    int contador, control;
    Scanner lectura = new Scanner(System.in);

    System.out.println("Inserta un numero menor al 100");
    control = lectura.nextInt();

    contador = 100;

      while(contador>=control)
      {
        System.out.printf("Conteo: %d%n", contador);

        contador--;
      }
  }
}
