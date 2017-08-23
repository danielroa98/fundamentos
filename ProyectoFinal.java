/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;
import java.util.*;
import javax.swing.JOptionPane;
/**
 * Entrega cuatro
 * Daniel Roa
 * 22 de noviembre del 2016
 */
public class ProyectoFinal {
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   //comienza delcaración de variables
        Scanner lectura = new Scanner (System.in);
    JOptionPane ventana = new JOptionPane();
   boolean error = false;
    String[] botones={"Cancelar"};
    String[] botones1={"Continuar"};
    String[] botones2={"Salir", "Editar balance mensual", "Ver balance mensual", "Resumen de balance"};
    String[] botones3={"11", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1", "0"};
    String[] botones4={"Retirar", "Depositar"};
    int cont=0;
    int index=0, editar_mes = 0, opcion=0, x=0, y=0, grafica=0;
    int dineros=0;
    String editar_balance="", ver_balance = null, resumen_de_balance = null;
    String nombre="", password="";

    String[] contrasenia = new String[10];
        contrasenia[0]="aa";
        contrasenia[1]="bb";
        contrasenia[2]="cc";
        contrasenia[3]="dd";
        contrasenia[4]="ee";
        contrasenia[5]="ff";
        contrasenia[6]="gg";
        contrasenia[7]="hh";
        contrasenia[8]="ii";
        contrasenia[9]="jj";

    String[] user = new String[10];
        user[0]="Rodrigo";
        user[1]="Ruben";
        user[2]="Daniela";
        user[3]="Diego";
        user[4]="Alejandro";
        user[5]="Miriam";
        user[6]="Cristina";
        user[7]="Camila";
        user[8]="Alan";
        user[9]="Alfredo";

        int[][] dinero = new int [10] [12];
            dinero [0][0] = 550; dinero [0][1] = 50; dinero [0][2] = 10; dinero [0][3] = 0; dinero [0][4] = 1000;
            dinero [0][5] = 5000; dinero [0][6] = 250; dinero [0][7] = 310; dinero [0][8] = 750; dinero [0][9] = 1500;
            dinero [0][10] = 7500;dinero [0][11] = 6550;

            dinero [1][0] = 250; dinero [1][1] = 50; dinero [1][2] = 0; dinero [1][3] = 5000; dinero [1][4] = 20;
            dinero [1][5] = 540; dinero [1][6] = 520; dinero [1][7] = 7500; dinero [1][8] = 250; dinero [1][9] = 1000;
            dinero [1][10] = 1230; dinero [1][11] = 120;

            dinero [2][0] = 540; dinero [2][1] = 1250; dinero [2][2] = 10; dinero [2][3] = 520; dinero [2][4] = 5250;
            dinero [2][5] = 7130; dinero [2][6] = 4570; dinero [2][7] = 9750; dinero [2][8] = 1290; dinero [2][9] = 1250;
            dinero [2][10] = 4580; dinero [2][11] = 410;

            dinero [3][0] = 550; dinero [3][1] = 9480; dinero [3][2] = 7850; dinero [3][3] = 9850; dinero [3][4] = 6840;
            dinero [3][5] = 2840; dinero [3][6] = 4820; dinero [3][7] = 9510; dinero [3][8] = 7530; dinero [3][9] = 2480;
            dinero [3][10] = 55550; dinero [3][11] = 350;

            dinero [4][0] = 120; dinero [4][1] = 210; dinero [4][2] = 21210; dinero [4][3] = 210; dinero [4][4] = 1200;
            dinero [4][5] = 3260; dinero [4][6] = 1560; dinero [4][7] = 21510; dinero [4][8] = 1510; dinero [4][9] = 1150;
            dinero [4][10] = 51250; dinero [4][11] = 2120;

            dinero [5][0] = 3250; dinero [5][1] = 4840; dinero [5][2] = 5410; dinero [5][3] = 51250; dinero [5][4] = 5450;
            dinero [5][5] = 3260; dinero [5][6] = 5150; dinero [5][7] = 5410; dinero [5][8] = 54180; dinero [5][9] = 120;
            dinero [5][10] = 1850; dinero [5][11] = 51450;

            dinero [6][0] = 54320; dinero [6][1] = 760; dinero [6][2] = 6540; dinero [6][3] = 6540; dinero [6][4] = 430;
            dinero [6][5] = 5430; dinero [6][6] = 9870; dinero [6][7] = 9870; dinero [6][8] = 870; dinero [6][9] = 540;
            dinero [6][10] = 4320; dinero [6][11] = 430;

            dinero [7][0] = 540; dinero [7][1] = 430; dinero [7][2] = 20; dinero [7][3] = 6540; dinero [7][4] = 7650;
            dinero [7][5] = 870; dinero [7][6] = 8760; dinero [7][7] = 8760; dinero [7][8] = 8760; dinero [7][9] = 680;
            dinero [7][10] = 870; dinero [7][11] = 80;

            dinero [8][0] = 760; dinero [8][1] = 7650; dinero [8][2] = 4350; dinero [8][3] = 5460; dinero [8][4] = 8760;
            dinero [8][5] = 34560; dinero [8][6] = 4350; dinero [8][7] = 34560; dinero [8][8] = 34560; dinero [8][9] = 4560;
            dinero [8][10] = 345630; dinero [8][11] = 4560;

            dinero [9][0] = 54340; dinero [9][1] = 4530; dinero [9][2] = 3450; dinero [9][3] = 3450; dinero [9][4] = 4560;
            dinero [9][5] = 4320; dinero [9][6] = 6540; dinero [9][7] = 5430; dinero [9][8] = 5430; dinero [9][9] = 54650;
            dinero [9][10] = 9870; dinero [9][11] = 6540;
            //termina declaración de variables
    while(error == false){
        nombre = JOptionPane.showInputDialog(null,"Inserte su usuario:","Login",
                JOptionPane.QUESTION_MESSAGE);
        password = JOptionPane.showInputDialog(null,"Inserte su contrasena:","Login",
                JOptionPane.QUESTION_MESSAGE);
        cont=0;
        while (cont<10){//se abre while
           if (nombre.equals(user[cont])){//se abre ciclo if
               error=false;
               index=cont;
            }//se cierra ciclo if
           cont++;
        }// se cierra ciclo while
   if (error==false){
            if (contrasenia[index].equals(password)){
                JOptionPane.showOptionDialog(null, "Bienvenido/a a su cuenta",
                        "Bienvenido " +user[index], 0,
                        JOptionPane.INFORMATION_MESSAGE, null, botones1, botones[0]);
            }//cierre while
            else{//se abre else
                System.out.println(contrasenia[index]+password);
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta","Error",
                        JOptionPane.ERROR_MESSAGE);
            }//se cierra else

            error=true;
        }//cierre if
        else{//se abre else
           JOptionPane.showMessageDialog(null, "Ese usuario no existe, pruebe otra vez","Error",
                   JOptionPane.WARNING_MESSAGE);
        }//cierre else
   error = true;

   JOptionPane.showMessageDialog(null, "Por favor, recuerde que los meses van de 0 a 11 (0 representa enero).","Info",
                   JOptionPane.INFORMATION_MESSAGE);

   dineros = JOptionPane.showOptionDialog(null, "Escoga una opción", "Escoge tu opcion",0,
            JOptionPane.INFORMATION_MESSAGE,null, botones2,botones[0]);

   switch (dineros) {
       case 0://cuarta opción
      System.exit(0);
           break;

       case 1://tercera opción

           editar_mes =  JOptionPane.showOptionDialog(null, "¿Que mes desea editar?", "Mes",0,JOptionPane.QUESTION_MESSAGE,null, botones3, botones[0]);
           //int mensualidad = Integer.parseInt(editar_mes);

           editar_balance = JOptionPane.showInputDialog(null,"Inserte la cantidad a depositar:",
               "Balance",JOptionPane.QUESTION_MESSAGE);

       int deposito = Integer.parseInt(editar_balance);

        int balances = 0;
        balances = deposito + dinero[index][editar_mes];

        JOptionPane.showMessageDialog(null,"Su nueva cantidad es de " +balances+ " pesos.",
                "Balance",JOptionPane.QUESTION_MESSAGE);

           break;

       case 2://segunda opción
           JOptionPane.showMessageDialog(null,"Su balance es de " +dinero[index][editar_mes]+ " pesos.",
                   "Balance",JOptionPane.INFORMATION_MESSAGE);dinero[index][editar_mes] = Integer.parseInt(ver_balance);
           break;

       case 3://primera opción
           x = 0;
           y = 0;

           grafica = 0;

           for(y=0; y<12; y++){
            grafica = dinero[index][y] / 100;
            switch (y){
                case 0:
                    editar_balance = "Ene:   "+grafica;
                    break;
                case 1:
                    editar_balance = "Feb:   "+grafica;
                    break;
                case 2:
                    editar_balance = "Mar:   "+grafica;
                    break;
                case 3:
                    editar_balance = "Abr:   "+grafica;
                    break;
                case 4:
                    editar_balance = "May:   "+grafica;
                    break;
                case 5:
                    editar_balance = "Jun:   "+grafica;
                    break;
                case 6:
                    editar_balance = "Jul:   "+grafica;
                    break;
                case 7:
                    editar_balance = "Ago:   "+grafica;
                    break;
                case 8:
                    editar_balance = "Sep:   "+grafica;
                    break;
                case 9:
                    editar_balance = "Oct:   "+grafica;
                    break;
                case 10:
                    editar_balance = "Nov:   "+grafica;
                    break;
                case 11:
                    editar_balance = "Dic:   "+grafica;
                    break;
            }
            System.out.print(editar_balance);
            for(x=0; x<grafica; x++){
            System.out.print("█");
            }//cierre del ciclo x
            System.out.println(" ");
        }//cierre del ciclo y
           break;

   }
    }//cierre del while
    }//termina class
}//termina main
