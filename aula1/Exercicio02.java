package aula1;
import java.util.Scanner;

// Média

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double n1, n2, n3, media;
        
        System.out.println("Insira os três valores para calcular a média: \n");
        
        n1 = scan.nextDouble();
        n2 = scan.nextDouble();
        n3 = scan.nextDouble();
        
        media = (n1 + n2 + n3)/3.0;
        
        System.out.printf("A média dos valores é %5.2f \n", media);
    }
  
}
