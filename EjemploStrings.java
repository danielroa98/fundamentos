public class EjemploStrings
{
  public static void main(String[] args)
  {
    String nombre = "Daniel";
    String parte = nombre.substring(3,4);

  palabras(nombre);
  }

  public static void palabras(String nom)
  {
    if (nom.length()<=1)
    {
      System.out.print(nom+" ");
    }
    else
    {
      palabras(nom.substring(0,nom.length()-1));
      System.out.print(nom+" ");
    }
    return;
  }
}
