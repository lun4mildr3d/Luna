package programa5;
import java.util.Scanner;

public class Programa5 {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
    double p1,p2,p3,total;
    System.out.print("Escribe precio 1: ");
    p1=sc.nextDouble();
    System.out.print("Escribe precio 2: ");
    p2=sc.nextDouble();
    System.out.print("Escribe precio 3: ");
    p3=sc.nextDouble();
    total = p1 + p2 + p3;
    if(total>=1500) {
        total = total - (total * 0.30);
        System.out.println("El total (30%desc): "+total);
    }else if(total<1200 && total>=1000) {
        total = total - (total * 0.20);
        System.out.println("El total (20%desc): "+total);
    }else if(total<1000 && total>=700){
        total = total - (total * 0.10);
        System.out.println("El total (sin desc): "+total);
    }
    
    }
    
}
