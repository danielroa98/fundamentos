/*
Ejemplo de uso de condiciones con Switch y zip
Daniel Roa
*/
import java.util.Scanner;

public class Condiciones4
{
  public static void main(String[] args)
  {
    String zip;
    char codigo;

    Scanner lector = new Scanner(System.in);

    System.out.println("Escribe el numero de tu codigo postal");
    zip = lector.nextLine();

    codigo = zip.charAt(0);

    switch( codigo )
    {
      case '0': case '2': case '3':
        System.out.println("Este");
        break;
      case '4': case '5': case '6':
        System.out.println("Centro");
        break;
      case '7':
        System.out.println("Sur");
        break;
      case '8': case '9':
        System.out.println("Oeste");
        break;
      default:
        System.out.println("Esa opcion no existe");
    }
  }
}
