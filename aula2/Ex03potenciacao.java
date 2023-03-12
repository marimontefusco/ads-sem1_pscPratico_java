package aula2;

// Faça um programa que receba dois números maiores que zero, 
// Calcule e mostre um elevado ao outro -> Potenciação

import java.util.Scanner;
import java.lang.Math.*;

public class Ex03potenciacao {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double num1, num2, pot1, pot2;
        
        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        num2 = scan.nextDouble();
        
        pot1 = Math.pow(num1, num2);
        
        pot2 = Math.pow(num2, num1);
        
        System.out.printf("\n %.2f elevado à %.2f = %.2f", num1, num2, pot1);
        System.out.printf("\n %.2f elevado à %.2f = %.2f \n\n", num2, num1, pot2);
        
    }
}
