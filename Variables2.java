public class Variables2
{
  public static void main (String[] args)
  {
    char inicialNombre, inicialApellido;
    char codigoControl;

    inicialNombre = 'D';
    inicialApellido = 'R';

    codigoControl = '\n'; // \t

    System.out.println("Hola "+inicialNombre);
    System.out.println("Codigo: "+codigoControl);
    System.out.println("\"Hola de  \t nuevo \r "+inicialApellido);
    System.out.println("\\");

  }
}
