/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap3;

//classe que representa uma fatura de um tipo de item comprado em loja
import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class Invoice {

    private String nomeProduto;
    private String descricaoProduto;
    private int quantidadeProduto;
    private double precoProduto;

    //construtor que inicia todos os atributos
    public Invoice(String nomeProduto, String decricaoProduto, int quantidadeProduto, double precoProduto) {
        Scanner tec = new Scanner(System.in);

        while (quantidadeProduto <= 0) {
            System.out.println("Atencao, nenhum item do tipo " + nomeProduto + " selecionado. Por favor digite a quantidade desejada: ");
            quantidadeProduto = tec.nextInt();
        }
        while (precoProduto <= 0) {
            System.out.println("Atencao, preco do" + nomeProduto + " é inválido. Por favor digite novamente o preço");
            precoProduto = tec.nextInt();
        }
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = decricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.precoProduto = precoProduto;

    }

    //metodos GETTER's e SETTER's
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public double getPrecoProduto() {

        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    //metodo que calcula o valor da fatura
    public double getInvoice(Invoice numero) {
        double total = (numero.getPrecoProduto() * numero.getQuantidadeProduto());
        return total;
    }

}
