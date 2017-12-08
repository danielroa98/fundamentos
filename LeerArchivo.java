import java.io.*;

public class LeerArchivo
{
  public static void main(String[] args) throws IOException
  {
    String nombreArchivo = "ejemplo2.csv";
    String datosLeidos;
    FileReader lector;
    BufferedReader br;
    String arreglo[] = new String[3];

    lector = new FileReader(nombreArchivo);//Siempre va el nombre del archivo
    br = new BufferedReader(lector); //Lee los renglones del documento


    while ((datosLeidos = br.readLine()) !=null)
    {
      System.out.println(datosLeidos);
        arreglo = datosLeidos.split(",");
        System.out.println(arreglo[0]);
    }


    lector.close();
  }
}
