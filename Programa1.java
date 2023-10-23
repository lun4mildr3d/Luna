package com.mycompany.P6;
import java.util.Scanner;

public class P6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero = 0;

        System.out.println("Ingrese  un número: ");
        numero = sc.nextInt();

        if ((numero % 2) == 0){
            System.out.println(numero + " es par");
        }else{
            System.out.println(numero + " es impar");
        }
     }
}
  