class sistemaRH
{
  public static void main(String[] args)
  {
    Empleado emp1 = new Empleado();

    emp1.nombre = "Daniel";
    emp1.salario = 240.3;
    //emp1.puesto = "Profesor";
    emp1.setPuesto("Profesor");

    Empleado emp2 = new Empleado();
    emp2.nombre = "Jorge";
    if (emp2.setPuesto("Estudiante"))
    {
      System.out.println("Error de asignación");
    }

    emp1.imprimeDatos();
    emp2.imprimeDatos();

    System.out.println("El puesto del empleado 1 es "+emp1.getPuesto());

    Empleado[] empleados = new Empleado[10];
    empleados[0] = new Empleado();
    empleados[0].nombre = "Jimenez";
    empleados[1] = new Empleado();
    empleados[1].nombre = "Simon";
    empleados[2] = new Empleado();
    empleados[2].nombre = "Gabriel";


    
    for (int i = 0; i<3; i++)
    {
    empleados[i].imprimeDatos();
    }
  }
}
