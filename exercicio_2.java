package com.mycompany.exercicios;

import java.util.Scanner;

public class exercicio_2 {
    
    public static void main(String[] args){
       //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
       
       Scanner sc = new Scanner(System.in);
       int num;
       
        System.out.println("Digite um número: ");
        num = sc.nextInt();
        
        if (num % 2 == 0){
            System.out.println("Número Par");
        }
        else {
            System.out.println("Número Impar");
        }
    }
}
