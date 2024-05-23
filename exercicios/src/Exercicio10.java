// Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();

        int temp = b;
        b = a;
        a = temp;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}
