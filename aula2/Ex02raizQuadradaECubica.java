package aula2;

// Faça um programa que receba um número positivo e maior que zero, calcule e mostre:
// Este número ao quadrado, ao cubo, sua raiz quadrada e sua raiz cúbica

import java.util.Scanner;
import java.lang.Math.*;

public class Ex02raizQuadradaECubica {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
        double num, aoQuadrado, aoCubo, raizQuadrada, raizCubica;
        
        System.out.println("Digite o número: ");
        num = scan.nextDouble();
        
        aoQuadrado = Math.pow(num, 2);
        
        aoCubo = Math.pow(num, 3);
        
        raizQuadrada = Math.sqrt(num);
        
        raizCubica = Math.cbrt(num);
        
        System.out.printf("\nNúmero ao quadrado: %.2f \nNúmero ao cubo: %.2f "
                + "\nRaiz quadrada: %.2f \nRaiz cúbicaa: %.2f\n\n", 
                aoQuadrado, aoCubo,raizQuadrada, raizCubica);
    }
}
