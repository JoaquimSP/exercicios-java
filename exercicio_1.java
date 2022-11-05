package com.mycompany.exercicios;

import java.util.Scanner;

public class exercicio_1 {
    
    public static void main(String[] args) {
        
        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
        
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Digite um número: ");
        num = sc.nextInt();
        
        if(num >= 0){
            System.out.println("Numero não negativo");
        }
        else {
            System.out.println("Numero Negativo");
        }
        
        sc.close();
    }
}
