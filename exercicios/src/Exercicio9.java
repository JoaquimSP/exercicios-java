// Faça algoritmo que leia o nome e a idade de uma pesoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("Nome: " + nome);
            System.out.println("Maior de idade");
        } else {
            System.out.println("Nome: " + nome);
            System.out.println("Menor de idade");
        }
    }
}
