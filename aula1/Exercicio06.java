package aula1;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double sBase, sBonus, sImposto, salFinal;
        
        System.out.println("Digite o salário base (R$): \n");
        sBase = scan.nextDouble();
        
        sBonus = sBase + (sBase * 0.05);
        
        sImposto = sBase - (sBase * 0.07);
        
        salFinal = (sBase +sBonus) - sImposto;
        
        System.out.printf("O salário a receber será de R$ %.2f",salFinal);
       
    }
}
