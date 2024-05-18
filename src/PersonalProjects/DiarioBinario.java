/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersonalProjects;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class DiarioBinario {

    private static ObjectOutputStream objSaida; //gera saida dos dados no arquivo
    Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        abrirArquivo();
       // addInformacoes();
      //  fecharArquivo();

    }

    //abre ou cria o arquivo indicado
    public static void abrirArquivo() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo para registro");
        String nomeArquivo = teclado.nextLine();
        try {
            objSaida = new ObjectOutputStream(Files.newOutputStream(Paths.get(nomeArquivo)));

        } catch (IOException ioException) {
            System.err.println("Error ao abrir o arquivo");
            System.exit(1);
        }

    }

    public static void AddInformacoes() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a entrada");
        
      // ----------------//para continuar o projeto preciso resolver o impasse sobre como gerir as informacoes a cada nova entrada. copiar a antiga e lancar em uma stringbuilder e depois fazer o novo lancamento das novas reflexoes ou copiar e colar tudo manualmente. Eu deveria fazer a entrada dos dados existentes. Analisar. Fazer novas consideracoes e so então regravar todo o conteudo.
        
        
    }

}
