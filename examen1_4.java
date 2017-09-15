/*
En un hotel se cobra a $850 pesos por noche, sin incluir alientos, y se cobran 
$150 pesos extra por alimentos por cada adulto (no se permite que haya planes mixtos). 
Si hay niños, se pagan $400 por noche extra por cada niño (máximo 3 niños) 
Las comidas de los niños y están incluidas en el plan con alimentos. 

Solicite al usuario el número de noches, si desean alimentos, 
el número de adultos y el número de niños.

Calcular el total a pagar.
*/
import java.util.Scanner;

public class examen1_4
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int noches;
		String alimentos;
		int adultos;
		int ninos;
		int total;
		
		System.out.println("Bienvenidos al Hotel 'La Perdicion del Alumno'");
		System.out.println("Dame el número de noches");
		noches = stdIn.nextInt();
		System.out.println("Dame el número de adultos");
		adultos = stdIn.nextInt();	
		System.out.println("Dame el número de niños");
		ninos = stdIn.nextInt();
		
		stdIn.nextLine();
		System.out.println("Deseas el plan del alimentos");
		alimentos = stdIn.nextLine(); //VA A FALLAR
		
		if(ninos<=3 && ninos>=0)
		{
			if(alimentos.equals("si"))
			{
				total = noches*(adultos*1000+ninos*400);
			}
			else
			{
				total = noches*(adultos*850+ninos*400);
			}
			System.out.printf("El total a pagar es %d", total);
		}
		else
		{
			System.out.printf("Tienes muchos niños. Ve más television.");
		}
	}
}
		
							