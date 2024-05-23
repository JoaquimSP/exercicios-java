// Faça um algoritmo que receba um número inteiro e imprima
// na tela o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class Exercicio3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Digite um número inteiro: ");
       int num = sc.nextInt();

       int antecessor = num - 1;
       int sucessor = num + 1;

       System.out.println("Antecessor = " + antecessor);
       System.out.println("Sucessor = " +  sucessor);
   }
}
