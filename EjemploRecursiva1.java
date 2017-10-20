/*
Daniel Roa
A01021960
19 de Octubre del 2017
Ejemplo Función Recursiva
*/
public class EjemploRecursiva1
{
/*
Hacer un programa que muestre un conteo de 1 a 100 con una función recursiva
*/
  public static void main(String[] args)
  {
    int numero = 10;
    conteo(numero);
  }

  public static void conteo(int num)
  {
    if (num<=0)
      return;
    else
    {
        //System.out.printf("%d ",num);
        conteo(num-1); //Llama de nuevo al metodo
        System.out.printf("%d ", num);
        return;
    }
  }
}
