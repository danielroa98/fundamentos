import java.util.Scanner;

public class examen1_1
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
		
		if(imc<18.50)
		{
			System.out.print("Tienes peso bajo");
		}
		else if(imc < 25)
		{
			System.out.print("Tienes peso normal");
		}
		else
		{
			System.out.print("Tienes sobrepeso ");
		}
		
		
	}
	
	public static double calcularIMC(double weight, double height)
	{
		double imc;
		imc = weight/(height*height);
		return imc;		
	}
	
}