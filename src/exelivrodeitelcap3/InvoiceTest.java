/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap3;

/**
 *
 * @author Diogo
 */
public class InvoiceTest {

    public static void main(String[] args) {

        Invoice bmw = new Invoice("BMW", "Luxo sobre rodas", 10, 347.500);
        Invoice gol = new Invoice("Gol", "Move o mundo", 0, 65.800);

        System.out.println(bmw.getNomeProduto() + " " + bmw.getDescricaoProduto() + " " + bmw.getQuantidadeProduto() + " " + bmw.getPrecoProduto());
        System.out.printf("%s%n%s e %.2f\n", "O valor da sua fatura para a compra de: ", bmw.getNomeProduto(), bmw.getInvoice(bmw));

        System.out.println("\n"+gol.getNomeProduto() + " " + gol.getDescricaoProduto() + " " + gol.getQuantidadeProduto() + " " + gol.getPrecoProduto());
        System.out.printf("%s%n%s e %.2f\n", "O valor da sua fatura para a compra de: ", gol.getNomeProduto(), gol.getInvoice(gol));
    }

}
