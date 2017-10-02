public class For2
{
  public static void main(String[] args)
  {
    for (int i=1; i<=9; i++)
    {
      //System.out.println("Estoy en la i="+i);
      for (int j=9; j>=i; j--)
      {
          System.out.printf(" (%d,%d) \t", i,j);
      }
      System.out.println();
    }
  }
}
