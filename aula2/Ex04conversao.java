package aula2;

// Faça um programa que receba uma medida em pés, faça a conversão para polegadas, 
// jardas e milhas e a seguir mostre os resultados sabendo que:
// 1 pé = 12 polegadas, 1 jarda = 3 pés, 1 milha = 1760 jardas

import java.util.Scanner;

public class Ex04conversao {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
         
        double numPes, polegadas, jardas, milhas;
        
        System.out.println("Digite o primeiro número: ");
        numPes = scan.nextDouble();
        
        polegadas = numPes * 12.0;
        
        jardas = numPes / 3.0;
        
        milhas = jardas / 1760;
        
        System.out.printf("\nConversão para polegadas: %.2f \nConversão para jardas: %.2f \nConversão para milhas: %.2f \n\n", 
                polegadas, jardas, milhas);
    }
}
