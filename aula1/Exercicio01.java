package aula1;
import java.util.Scanner;

//Soma de inteiros

public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n1,n2,n3,n4, soma;
        
        System.out.println("Insira os quatro valores para calcular a soma: \n");
        
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextInt();
        n4 = scan.nextInt();
        
        soma = n1 + n2 + n3 + n4;
        
        System.out.println("A soma é " + soma);
        
    }
}
