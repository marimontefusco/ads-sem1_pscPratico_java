package aula1;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double salInicial, salFinal;
        
        System.out.println("Digite seu salário atual (R$): ");
        salInicial = scan.nextDouble();
        
        salFinal = salInicial + (salInicial * 0.25);
        
        System.out.printf("\nSeu novo salário será de %.2f \n\n", salFinal);
        
    }
}
