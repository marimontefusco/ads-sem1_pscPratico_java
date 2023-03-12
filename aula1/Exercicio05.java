package aula1;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double salInicial, salFinal;
        float porcentAumento;
        
        System.out.println("Digite seu salário atual (R$): \n");
        salInicial = scan.nextDouble();
        
        System.out.println("\nDigite a porcentagem do aumento (%): \n");
        porcentAumento = scan.nextFloat();
        
        salFinal = salInicial + (salInicial * (porcentAumento/100));
        
        System.out.printf("\n\nSeu novo salário será de R$ %.2f. \n\n", salFinal);
        
    }
        
}
