import java.util.Scanner;

public class Pregunta3{
  public static void main(String[] args)
  {
    Scanner lectura = new Scanner(System.in);
    int adulto, adultos, chamaco, chamacos, noche, comida, comidas, preciotot;
    noche = 850;
    comidas = 150;

    System.out.println("Buenas, cuantas noches se va a hospedar? Escribir cantidad");
    adulto = lectura.nextInt();

    System.out.println("Hay algun chamaco acompañandolo? Escribir cantidad");
    chamaco = lectura.nextInt();

    System.out.println("Cuantos planes de comida van a solicitar? Escribir cantidad");
    comida = lectura.nextInt();

    chamacos = chamaco * 400;
    adultos = adulto * 850;
    comidas = comida * 150;

    preciotot = chamacos + adultos + comidas;

    System.out.printf("El precio total es de %s%n", preciotot);

  }
  /*
  C:\Users\danie\Favorites\Programacion\Fundamentos>java Pregunta3
    Buenas, cuantas noches se va a hospedar? Escribir cantidad
    2
    Hay algun chamaco acompaÃ±andolo? Escribir cantidad
    4
    Cuantos planes de comida van a solicitar? Escribir cantidad
    7
    El precio total es de 4350
    */
}
