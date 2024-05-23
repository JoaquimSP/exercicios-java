// Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
// pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
// Tabela de Código de Condições de Pagamento
// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double produto = sc.nextDouble();

        System.out.println("--- Agora selecione a forma de pagamento ---" +
                "\n1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto" +
                "\n2 - À Vista no cartão de crédito, recebe 10% de desconto" +
                "\n3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros" +
                "\n4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        int escolha = sc.nextInt();

        double valorDesconto;
        double valorPagar;

        switch (escolha) {
            case 1:
                valorDesconto = produto * 15 / 100;
                valorPagar = produto - valorDesconto;
                System.out.println("Opção 1 escolhida");
                System.out.printf("Valor do produto a ser pago: R$ %.2f ", valorPagar);
                break;
            case 2:
                valorDesconto = produto * 10 / 100;
                valorPagar = produto - valorDesconto;
                System.out.println("Opção 2 escolhida");
                System.out.printf("Valor do produto a ser pago: R$ %.2f ", valorPagar);
                break;
            case 3:
                System.out.println("Opção 3 escolhida");
                System.out.printf("Valor do produto a ser pago: R$ %.2f ", produto);
                break;
            case 4:
                double valorJuros = produto * 10 / 100;
                valorPagar = produto + valorJuros;
                System.out.println("Opção 4 escolhida");
                System.out.printf("Valor do produto a ser pago: R$ %.2f ", valorPagar);
                break;
            default:
                System.out.println("Opção que você digitou é inválida! Tente outra vez.");
                break;
        }
    }
}
