import java.util.Scanner; //necesario para poder leer datos escritos desde el teclado

public class Entrada1
{
  public static void main (String[] args)
  {
    String nombre;//, apellido;

    Scanner stdIn =new Scanner(System.in);/*********/
    //Scanner atdIn = new Scanner(System.in);

    nombre = stdIn.nextLine();/**********/
    //apellido = atdIn.nextLine();
    System.out.println("Hola "+nombre);
  }
}
