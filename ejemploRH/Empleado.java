public class Empleado
{
  String nombre;
  double salario;
  private String puesto = "";

  public void imprimeDatos()
  {
    System.out.println("");

  System.out.println("Nombres: \t "+this.nombre );
  System.out.println("Salario: \t "+this.salario);
  System.out.println("Puesto: \t "+this.puesto);
  }

  public boolean setPuesto(String puesto)
  {
    if (puesto.equals("alumno") || puesto.equals("Profesor"))
    {
    this.puesto = puesto;
    return true;
    }
    else
      return false;
  }
  public String getPuesto()
  {
    return puesto;
  }
}
