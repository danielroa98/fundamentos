import java.util.Scanner;

public class While2
{
  public static void main(String[] args)
  {
    Scanner lectura = new Scanner(System.in);
    double lado;
    String respuesta;

    //respuesta = "si";
    for(respuesta="si" ; !respuesta.equalsIgnoreCase("no") ; )
    {
      System.out.println("Dame el lado de un cuadrado para calcular su area");
      lado = lectura.nextDouble();
      lectura.nextLine();

      System.out.printf("El area es %.2f %n", lado*lado);

      System.out.println("Quieres hacerlo de nuevo? (si) (no)");
      respuesta = lectura.nextLine();
    }
    System.out.println("Gracias");
  }
}
