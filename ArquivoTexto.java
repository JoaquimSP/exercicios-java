/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arquivo.texto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoTexto {

    public static void main(String[] args) throws IOException {
        File arquivo = new File("D:/arquivo.txt");
        boolean existe = arquivo.exists();
        if(existe){
           System.out.println("Arquivo já existe!");
        } else {
           System.out.println("Arquivo não existe!");
           FileWriter fw = new FileWriter(arquivo, true);
        }
    }
}