public class JuntaString
{
  public static void main(String[] args)
  {
    String[] nombres={"Daniel", "Roa", "González"};
    String lineaCSV;

    lineaCSV = String.join(", ", nombres);

    System.out.println(lineaCSV);

    /*************************SEPARANDO****************************/
    System.out.println("");

    String[] separados;

    separados = lineaCSV.split(",");

    System.out.println(separados[0]); //el valor que se encuentra dentro [0], es el valor correspondiente del String nombres
  }
}
