public class CodePoint1
{
  public static void main(String[] args)
  {
    String str = "Niño";
    int val1;
    Character letra;

    str = "niño 𝒫";
    val1 = str.codePointAt(2);

    System.out.printf("El CodePoint es %d%n", val1);
    System.out.printf("El CodePoint es %d%n", str.codePointAt(1));

    System.out.printf("El char es %c", str.charAt(2));
  }
}
