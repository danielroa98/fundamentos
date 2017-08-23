public class correccionEcuacion
{
  public static void main(String[] args)
  {
    double numero1, numero2, numero3, raiz, inferior, superiorpos, superiorneg;

      numero1 =Double.parseDouble(args[0]);
      numero2 =Double.parseDouble(args[1]);
      numero3 =Double.parseDouble(args[2]);

      raiz = Math.sqrt(((numero2*numero2)-(4*(numero1*numero3))));
      inferior = (numero1*2);
      superiorpos = (-numero2+raiz);
      superiorneg = (-numero2-raiz);

      System.out.println("El resultado de x positivo es "+((superiorpos)/inferior));
      System.out.println("El resultado de x negativo es "+((superiorneg)/inferior));
  }
}
