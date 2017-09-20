import java.util.Scanner;

public class While4
{
    public static void main(String[] args)
    {
      Scanner lectura = new Scanner(System.in);
      int contador;
      contador = 1;

      do {
        System.out.printf("%d ", contador);
        contador++;
      } while (contador<=10);
    }
}
