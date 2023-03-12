package aula1;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double vDeposito, taxa, vRendimento, vFinal;
        
        System.out.println("Digite o valor do depósito (R$): \n");
        vDeposito = scan.nextDouble();
        
        System.out.println("\nDigite o valor da taxa de juros simples (%): \n");
        taxa = scan.nextDouble();
     
        vFinal = vDeposito + (vDeposito * (taxa/100));
        
        vRendimento = vFinal - vDeposito;
   
        System.out.printf("\nO valor total do rendimento será de %.2f. \nCom isso seu dinheiro rendeu %.2f. \n\n", 
                vFinal, vRendimento);
        
    }
}
