public class CodePoint1.2
{
  public static void main(String[] args)
  {
    String str;
    int val1;

     str = "Es misión del Tecnológico de Monterrey formar personas íntegras, éticas, con  una visión humanística y competitivas internacionalmente en su campo  profesional, que al mismo tiempo sean ciudadanos comprometidos con el  desarrollo económico, político, social y cultural de su comunidad y con el uso  sostenible de los recursos naturales.";

    if(str.contains("Misión"))
      System.out.println("Existe");
    else
      System.out.println("No existe");
  }
}
