import java.io.*;

public class EscribirArchivos
{
  public static void main(String[] args) throws IOException
  {
    //forma larga

    File archivo;

    archivo = new File("ejemplo1.txt");
    archivo.createNewFile();

    FileWriter escritor = new FileWriter(archivo, true);

    /*
    NO USAR ASI
    escritor.write("Ejemplo de archivo.\nSalto de linea.%nOtra Linea");
    */
    PrintWriter pw = new PrintWriter(escritor);

    pw.printf("Ejemplo de archivo con formato.%nNúmero %d", 1218);

  escritor.close();
  }
}
