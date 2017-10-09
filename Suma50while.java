public class Suma50while
{
public static void main(String[] args)
{
int counter=0;

System.out.printf("La sumatoria es %d.%n",Sumatoria(counter));

}

public static int Sumatoria(int counter)
{
int uno=1;
int cincuenta = 50;
int sumatoria= 1;

while (uno<=counter || counter<=cincuenta)
{
sumatoria = (counter*(sumatoria + counter))/2;
sumatoria++;
}
return sumatoria;
}
}
