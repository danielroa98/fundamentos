public class Variables2
{
  public static void main (String[] args)
  {
    char inicialNombre, inicialApellido;
    char codigoControl;
    //int, long
    //double, float
    //char, String

    inicialNombre = 'D';
    inicialApellido = 'R';

    codigoControl = '\n'; // \t

    String texto = "Mi nombre es ";

    System.out.println("Hola "+inicialNombre);
    System.out.println("Codigo: "+codigoControl);
    System.out.println("\"Hola de  \t nuevo \r "+inicialApellido);
    System.out.println("\\");

    System.out.println("Los caracteres de texto son "+texto.length());
    System.out.println("El caracter en 5 es "+texto.charAt(12));

  }
}
