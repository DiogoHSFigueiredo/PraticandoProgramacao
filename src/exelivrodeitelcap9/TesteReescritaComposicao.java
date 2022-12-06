/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap9;

/**
 *
 * @author Diogo
 */
public class TesteReescritaComposicao {
    

    
    public static void main(String[] args) {
            ComissionEmployee Teste1 = new ComissionEmployee("NomeTeste", "SobrenomeTeste","500-200-100", 20, 0.2);
    
    ReescritaComposicao Diogo = new ReescritaComposicao(Teste1, 800.0);
        System.out.println(Diogo.toString(Teste1));
    }
         
}
