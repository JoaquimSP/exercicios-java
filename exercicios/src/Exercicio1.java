import java.util.Scanner;

// 1- Faça um algoritmo que leia os valores de A, B, C e em seguida
// imprima na tela a soma entre A e B é mostre se a soma é menor que C.

public class Exercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = sc.nextInt();

        int soma = a + b;

        if(soma > c) {
            System.out.println("Soma é Maior que o valor de C");
            System.out.println("Soma = " + soma + "; C = " + c);
        } else {
            System.out.println("Soma não é maior que o valor de C");
            System.out.println("Soma = " + soma + "; C = " + c);
        }

        //System.out.println("Soma entre A + B = " + soma);
        //System.out.println("C = " + c);
    }
}
