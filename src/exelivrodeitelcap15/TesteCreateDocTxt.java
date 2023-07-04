/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap15;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class TesteCreateDocTxt {

    private static Formatter arquivo;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner teclado = new Scanner(System.in);
        String info = "";

        arquivo = new Formatter("Cliente.txt"); //cria ou abre o arquivo no diretorio
        System.out.println("Digite o texto a ser enviado ao arquivo no seguinte formado\nNome, idade");
        info = teclado.next() + " " + teclado.next();
        arquivo.format(info);
        if (arquivo != null) {
            arquivo.close();

        }
    }
}
