/*
Calcule e indique el IMC ( Peso/Estatura2) y diga en que rango está el usuario. 
Se debe pedir la altura en metros y el peso en kilogramos. 
Para calcular el IMC use una función definida por usted. 
Vea la tabla siguiente
*/
import java.util.Scanner;

public class examen1_3
{
	public static void main(String[] args)
	{
		Scanner lectura = new Scanner(System.in);
		double peso, altura;
		double imc;
		
		System.out.print("Dame tu peso en kilogramos: ");
		peso = lectura.nextDouble();
		System.out.print("Dame tu altura en metros: ");
		altura = lectura.nextDouble();
		
		imc = calcularIMC(peso, altura);
		
		if(imc<16)
		{
			System.out.print("Delgadez severa");
		}
		else if(imc < 17)
		{
			System.out.print("Delgadez moderada");
		}
		else if(imc < 18.5)
		{
			System.out.print("Delgadez leve");
		}
		else if(imc < 25)
		{
			System.out.print("Normal");
		}
		else if(imc < 30)
		{
			System.out.print("Preobeso");
		}
		else if(imc < 35)
		{
			System.out.print("Obesidad leve");
		}
		else if(imc < 40)
		{
			System.out.print("Obesidad media");
		}
		else 
		{
			System.out.print(" Obesidad mórbida");
		}
		
	}
	
	public static double calcularIMC(double weight, double height)
	{
		double imc;
		imc = weight/(height*height);
		return imc;		
	}
	
}