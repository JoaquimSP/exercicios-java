package com.mycompany.exercicios;

import java.util.Scanner;

// Fazer um programa para ler um valor inteiro de 1 a 7 representando um
// dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
// Escrever na tela o dia da semana correspondente, conforme exemplos.

public class switch_case {
        
    public static void main(String[] args){
        
        System.out.println("Digite um número da semana: ");  
      Scanner sc = new Scanner(System.in);
      
      int x = sc.nextInt();
      String dia;
      
      switch(x) {
          case 1:
            dia = "Domingo";
            break;
          case 2:
            dia = "Segundo-feira";
            break;
          case 3:
            dia = "Terça-feira";
            break;
          case 4:
            dia = "Quarta-feira";
            break;
          case 5:
            dia = "Quinta-feira";
            break;
          case 6:
            dia = "Sexta-feira";
            break;
          case 7:
            dia = "Sábado";
            break;
          default:
            dia = "Valor inválido";
            break;        
      }
      
        System.out.println("Dia da semana: " +dia);
   }
}
