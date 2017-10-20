/*
Daniel Roa
A01021960
16 de Octubre del 2017
FuncionRecursiva
*/
public class FuncionRecursiva
{
  public static void main(String[] args)
  {
  //CALCULO DE SUMATORIA HASTA N
  //1 + 2 +3 +....
  int n = 15;
  int suma = 0;

  System.out.format("Sumatoria %d%n", sumatoriaRecursiva(n));
  System.out.format("Factorial %d%n", factorial(n));
  }

  public static int sumatoriaRecursiva(int n)
  {
    if(n==1)
      return 1;
    else if(n<0)
      return 0;
    else
      return n+sumatoriaRecursiva(n-1);

  }

  public static long factorial(long n)
  {
    if(n<=1)
      return 1;
    else
      return n*factorial(n-1);
  }

  public static int sumatoria(int n)
  {
    int suma = 0;
    for (int cont=1; cont<=n; cont++)
    {
        suma += cont;
    }
    return suma;
  }
}
