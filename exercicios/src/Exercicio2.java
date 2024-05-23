// Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais,
// deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de qualquer
// um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.

import java.util.Scanner;

public class Exercicio2 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       int c;

       System.out.println("Digite o valor de A: ");
       int a = sc.nextInt();

       System.out.println("Digite o valor de B: ");
       int b = sc.nextInt();

       if(a == b) {
           c = a + b;
       } else {
           c = a * b;
       }

       System.out.println("Resultado final = " + c);

   }
}
