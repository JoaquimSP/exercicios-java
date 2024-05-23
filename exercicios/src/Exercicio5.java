// Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a 1° nota do Aluno: ");
        double nota1 = sc.nextInt();

        System.out.print("Digite a 2° nota do Aluno: ");
        double nota2 = sc.nextInt();

        System.out.print("Digite a 3° nota do Aluno: ");
        double nota3 = sc.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Media das notas = " + media);
    }
}
