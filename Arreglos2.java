import java.util.Scanner;

public class Arreglos2{// tambien llamado vector
 public static void main (String agrs[]){
  int calif;
  Scanner l = new Scanner(System.in);

  System.out.print("Cuantas caificaciones quieres promediar?: ");
  calif= l.nextInt();
  double[] all= new double[calif];

  for(int i=0;i<all.length;i++){
   System.out.printf("Ingresa la calif[%d]: ",i+1);
   all[i]= l.nextDouble();
  }

  promedia(all);

  String pregunta;
  l.nextLine(); //limpiar el enter que queda de los numeros
  System.out.print("Quieres cambiar una calif?: s/n: ");
  pregunta= l.nextLine();

  while(pregunta.equalsIgnoreCase("s")){
   System.out.print("Que posicion de calif?: ");
   calif= l.nextInt();
   System.out.printf("Ingresa la calif en %d: ",calif);
   all[calif-1]= l.nextDouble();
   promedia(all);
   l.nextLine();//limpiar el enter que queda de los numeros
   System.out.print("Quieres cambiar una calif?: s/n: ");
   pregunta= l.nextLine();
  }
  System.out.println("Bye");


 }
 public static void promedia(double[] all){
   double sum=0;
   for(int i=0; i<all.length;i++){
    System.out.printf("Calif en [%d] es %.2f%n",i+1,all[i]);
    sum+= all[i];
   }
   System.out.printf("promedio: %.2f%n",sum/all.length);
 }

}
