import java.util.Scanner;

public class While3
{
  public static void main(String[] args)
  {
    int contador,suma,num;

    Scanner lector= new Scanner(System.in);

    System.out.println("Escriba un numero");
    num= lector.nextInt();

    System.out.printf("Su sumatoria es %d.%n",sumatoria(num));

}
    public static int sumatoria(int num)
    {
    int contador=0;
    int suma = 0;
    while(contador<=num)
    {
      suma = suma + contador;
      contador++;

    }
    return suma;
  }
}
