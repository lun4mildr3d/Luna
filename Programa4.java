package programa_4;
import java.util.Scanner;
public class Programa_4 {
    
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in); //1
        int dia; //2
        System.out.print("Escribe el dia del mes numerico: ");
        mes=SC.nextInt (); //4
        switch(mes){
            case 1:
                System.out.println("enero");
                break;
            case 2:
                System.out.println("febrero");
                break;
            case 3:
                System.out.println("marzo");
                break;
            case 4:
                System.out.println("abril");
                break;
            case 5:
                System.out.println("mayo");
                break;
            case 6:
                    System.out.println("junio");
                break;
            case 7:
                System.out.println("julio");
                break;
            case 8:
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("septiembre");
                break;
            case 10:
                System.out.println("octubre");
                break;
            case 11:
                System.out.println("noviembre");
                break;
            case 12:
                System.out.println("diciembre");
                break;
            default:
                System.out.println("No existe el mes ingresado");    
        }//FIN SWICH
        
    }//FIN MAIN
    
}//FIN CLASS
  