public class Variables1
{
  public static void main (String[] args)
  {
    //Declarar variables
    int numero1;

    double numero2, numero3=0;
    double pi = 3.14;
    final double velocidadDeLaLuz = 299792458.0;

    pi = 3.1415926525897932384626;

    //velocidadDeLaLuz = 3.0; ERROS QUE ES FINAL

    numero3++; //Operacion unaria
    ++numero3; //Operacion unaria
    numero1 = (int) pi; //CAST - solo funciona entre numeros

    numero2 = (numero1 + numero3) / 2;

    //numero2 = numero2+numero1; es equivalente al de abajo
    numero2 += numero1;

    System.out.println(numero1);
    System.out.println(numero2);
    System.out.println(Math.sqrt(numero2++));
    System.out.println(numero2);

  }
}
