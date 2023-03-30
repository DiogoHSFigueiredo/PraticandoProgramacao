/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap10;

/**
 *
 * @author Diogo
 */
public class TestandoHierarquiaAnimais {

    public static void main(String[] args) {

        Cachorro Simba = new Cachorro("Simba", "Nasal", "Racao", "Correndo", 42.0, " Comer na Vasilha", "Latido Forte", "Golden Retriever", "Pelo Longo", "Irmão Toddy");
        System.out.println(Simba.getNome() + " " + Simba.getAlimentacao() + " " + Simba.getRespiracao() + " " + Simba.getLocomocao() + " " + Simba.getsomEmitido() + " " + Simba.getFormaAlimentacao());
    }

}
