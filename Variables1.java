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

    numero1 = (int) pi; //CAST - solo funciona entre numeros

    numero2 = (numero1 + numero3) / 2;

    System.out.println(numero1);

  }
}
