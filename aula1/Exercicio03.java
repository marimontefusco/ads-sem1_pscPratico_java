package aula1;
import java.util.Scanner;

// Média Ponderada

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double nota1, nota2, nota3, peso1, peso2, peso3, mediaPonderada;
        
        System.out.println( "Digite as notas: \n" );
        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();
        nota3 = scan.nextDouble();
            
        System.out.println( "\n Digite o peso de cada nota respectivamente: \n" );
        peso1 = scan.nextDouble();
        peso2 = scan.nextDouble();
        peso3 = scan.nextDouble();
        
        mediaPonderada = (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1 + peso2 + peso3);
        
        System.out.printf("\n O resultado da Média Ponderada é %5.2f. \n", mediaPonderada);
        
    }
}
