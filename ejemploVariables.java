public class ejemploVariables
{
	public static void main(String[] args)
	{
		//String numero0;
		int numero1;
		int numero2;

		//numero0="34";
		numero1 = Integer.parseInt(args[0]);
		numero2 = Integer.parseInt(args[1]);

		System.out.println("La suma es "+(numero1+numero2));
		System.out.println("La resta es "+(numero1-numero2));
		System.out.println("La multiplicaci�n es "+(numero1*numero2));
		//'cast' a un numero entero
		System.out.println("La divisi�n es "+((double)numero1/(double)numero2));
		System.out.println("El m�dulo es "+(numero1%numero2));
	}
}