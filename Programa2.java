package programa.cal;
import java.util.Scanner;


public class ProgramaCal {
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Cal = new Scanner (System.in);
        float S = 0, P;
        System.out.println("ingresa la primera calificacion: " );
            float C1 = Cal.nextFloat();
            System.out.println("ingresa la primera calificacion: " );
            float C2 = Cal.nextFloat();
            System.out.println("ingresa la primera calificacion: " );
            float C3 = Cal.nextFloat();
            System.out.println("ingresa la primera calificacion: " );
            float C4 = Cal.nextFloat();
            System.out.println("ingresa la primera calificacion: " );
            float C5 = Cal.nextFloat();
            System.out.println("ingresa la primera calificacion: " );
            float C6 = Cal.nextFloat();
            S= C1+C2+C3+C4+C5+C6;
            
        P = S / 6;
        if (P<70){
        System.out.println("El alumno esta aprobado");
        }else {
            System.out.println("El alumno esta reprobado");
        }
    }
    
}
