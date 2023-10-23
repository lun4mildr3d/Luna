package programa_3;
import java.util.Scanner;
public class Programa_3 {
    
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in); //1
        int dia; //2
        System.out.print("Escribe el dia de la semana numerico: ");
        dia=SC.nextInt (); //4
        switch(dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                    System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No existe el dia ingresado");    
        }//FIN SWICH
        
    }//FIN MAIN
    
}//FIN CLASS
