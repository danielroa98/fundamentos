/*
Examen 1er parcial
Luis Yépez
Dado un número entero, decir si es positivo, negativo o cero, 
y además si es divisible entre 2. (El número lo tiene que escribir el usuario).
*/
import java.util.Scanner;
public class examen1_2
{
	public static void main(String[] args)
	{
		Scanner lector  = new Scanner(System.in);
		int numero;
		System.out.println("Dame un numero");
		numero = lector.nextInt();
		
		if(numero>0)
			System.out.println("Positivo");
		else if(numero==0)
			System.out.println("Cero");
		else
			System.out.println("Negativo");
			
		if(numero%2==0)
			System.out.println("Par");
		else
			System.out.println("Impar");	
	}
	
}