// Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
// se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

import java.util.Scanner;

public class Exercicio7 {
   public static void main (String[] args) {
       Scanner sc = new Scanner (System.in);

       System.out.print("Digite a 1° nota: ");
       double nota1 = sc.nextDouble();

       System.out.print("Digite a 2° nota: ");
       double nota2 = sc.nextDouble();

       System.out.print("Digite a 3° nota: ");
       double nota3 = sc.nextDouble();

       System.out.print("Digite a 4° nota: ");
       double nota4 = sc.nextDouble();

       double media = (nota1 + nota2 + nota3 + nota4) / 4;

       if (media >= 7) {
           System.out.println("Aluno Aprovado!");
           System.out.println("Média = " + media);
       } else {
           System.out.println("Aluno reprovado!");
           System.out.println("Média = " + media);
       }
   }
}
