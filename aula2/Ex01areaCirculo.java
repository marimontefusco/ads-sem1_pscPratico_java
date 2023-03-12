package aula2;

// Faça um programa que calcule e mostre a área de um círculo
// Sabendo que A = π * r²

import java.util.Scanner;
import java.lang.Math.*;

public class Ex01areaCirculo {
    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       
       double raio, pi, area;
       
       System.out.println("Digite o raio do círculo: ");
       raio = scan.nextDouble();
       
       pi = Math.acos(-1.0);
       //pi = Math.acos(a);
      
       area = pi * (Math.pow(raio, 2));
       //A = π * r²
   
       System.out.printf("\nA área do círculo é %.2f \n\n", area);
    }
}

//Potenciação -> Math.pow(base, potencia)
//raioAoQuadrado = Math.pow(raio,2)