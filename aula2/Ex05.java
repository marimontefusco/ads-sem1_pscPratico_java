package aula2;
// Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual,
// Calcule e mostre idade atual da pessoa e quantos anos ela terá em 2050

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        double anoNascimento, anoAtual, idadeAtual, idadeFutura;
        
        System.out.println("Digite seu ano de nascimento: ");
        anoNascimento = scan.nextDouble();
        
        System.out.println("\nDigite o ano atual: ");
        anoAtual = scan.nextDouble();
        
        idadeAtual = anoAtual - anoNascimento;
        
        idadeFutura = 2050 - anoNascimento;
        
        System.out.printf("\nIdade atual: %.1f \nIdade em 2050: %.1f \n\n", idadeAtual, idadeFutura);
        
    }
}
