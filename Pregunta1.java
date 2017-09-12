import java.util.Scanner;

public class Pregunta1{
  public static void main(String[] args)
  {
    Scanner lectura = new Scanner(System.in);
    int no, dos;
    dos = 2;

      System.out.println("Inserta un numero, puede ser negativo o positivo");
      no = lectura.nextInt();

      if(no<0){
        System.out.println("Este numero es negativo");
      }
      else if(no==0){
        System.out.println("Este numero es igual a cero.");
      }
      else if(no>0){
        System.out.println("Este numero es positivo");
      }
      else;
  }
  /*
  C:\Users\danie\Favorites\Programacion\Fundamentos>java Pregunta1
    Inserta un numero, puede ser negativo o positivo
    2
    Este numero es positivo
    */
}
