import java.util.Scanner;

public class Pregunta2{
  public static void main(String[] args){
    Scanner lectura = new Scanner(System.in);
    double imc, peso, alt, alt2, bp, ds, dm, dl, dl2, nor, nor2, sp, po, ob, ol, om, om2, omor;
    bp = 18.50;
    ds = 16.00;
    dm = 16.99;
    dl = 17.00;
    dl2 = 18.49;
    nor = 18.50;
    nor2 = 24.99;
    sp = 25.00;
    po = 29.99;
    ob = 30.00;
    ol = 34.99;
    om = 35.00;
    om2 = 39.99;
    omor = 40.00;

    System.out.println("Inserte su peso en kg.");
    peso = lectura.nextDouble();

    System.out.println("Inserte su altura en metros.");
    alt = lectura.nextDouble();

    alt2 = alt*alt;

    imc = peso/alt2;

    if(imc<bp)
    {
      System.out.println("Usted esta en bajo peso");
    }
    else if (imc<ds){
      System.out.println("Usted esta en delgadez severa");
    }
    else if(imc>=ds && imc<=dm)
    {
      System.out.println("Usted esta en delgadez moderada");
    }
    else if(imc>=dl && imc<=dl2){
      System.out.println("Usted esta en delgadez leve");
    }
    else if(imc>=nor && imc<=nor2){
      System.out.println("Usted esta en peso normal");
    }
    else if (imc>=sp){
      System.out.println("Usted esta en sobrepeso");
    }
    else if(imc>sp && imc<=po){
      System.out.println("Usted esta en la preobesidad");
    }
    else if(imc>=ob){
      System.out.println("Usted esta entrando a la obesidad");
    }
    else if(imc>=ob && imc<= ol){
      System.out.println("Usted esta en la obesidad leve");
    }
    else if(imc>=om && imc<=om2){
      System.out.println("Usted esta en la obesidad media");
    }
    else if(imc>=omor){
      System.out.println("Usted esta MORBIDAMENTE OBESO");
    }
    /*
    C:\Users\danie\Favorites\Programacion\Fundamentos>java Pregunta2
    Inserte su peso en kg.
    20
    Inserte su altura en metros.
    1.30
    Usted esta en bajo peso
    */
  }
}
