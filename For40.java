public class For40
{
  public static void main(String[] args)
  {
    for (int numero=1 ; numero<=40 ; numero++)
    {
    System.out.print(numero);
    if(numero%2==0)
      System.out.print(" es par");
    System.out.println();

    if(numero%3==0)
      System.out.print(" es div entre 3");
    System.out.println();
    }
  }
}
