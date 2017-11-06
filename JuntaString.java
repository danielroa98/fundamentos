public class JuntaString
{
  public static void main(String[] args)
  {
    String[] nombres={"Daniel", "Roa", "González"};
    String lineaCSV;

    lineaCSV = String.join(", ", nombres);

    System.out.println(lineaCSV);
  }
}
