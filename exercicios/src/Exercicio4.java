//  Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
//  calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado.
//  (Base para o Salário mínimo R$ 1.293,20).

import java.util.Scanner;

public class Exercicio4 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       double salarioMinimo = 1293.20;

       System.out.print("Digite o valor de um salário: R$ ");
       double valorUsuario = sc.nextDouble();

       double qtdSalarioMin = valorUsuario / salarioMinimo;

       System.out.printf("Essa pessoa ganha %.2f salários mínimos.%n", qtdSalarioMin);
   }
}
