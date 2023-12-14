import java.util.Scanner;

public class ExamenU4 {
    
    public static void main(String[] args) {
        int Alumnos = 20;
        
        double[] calificaciones = new double[20];
        char[] letras = new char[20];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingresa la calificación del alumno: " + (i + 1));
            calificaciones[i] = scanner.nextDouble();
        }
        for (int i = 0; i < 20; i++) {
            letras[i] = obtenerLetras(calificaciones[i]);
        }
          System.out.println("\nCalificaciones convertidas a letras:");
        for (int i = 0; i < 20; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + calificaciones[i] + " - " + letras[i]);
        }
        
        scanner.close();
    }
    private static char obtenerLetras(double calificacion) {
        if (calificacion >= 90) return 'A';
        else if (calificacion >= 80) return 'B';
        else if (calificacion >= 70) return 'C';
        else if (calificacion >= 60) return 'D';
        else return 'E';
    }
}