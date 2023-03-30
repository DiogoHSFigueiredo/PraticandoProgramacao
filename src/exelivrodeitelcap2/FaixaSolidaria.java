/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap2;

import javax.swing.JOptionPane;

/**
 *
 * @author Diogo
 */
public class FaixaSolidaria {

    private String veiculo;
    private static double consumoLitro;
    private static double precoGas;
    private static double txEstacDia;
    private static double kmDia;

    public FaixaSolidaria(String veiculo, double consumoLitro, double precoGas, double txEstacDia, double kmDia) {
        this.veiculo = veiculo;
        this.consumoLitro = consumoLitro;
        this.precoGas = precoGas;
        this.txEstacDia = txEstacDia;
        this.kmDia = kmDia;
    }

    public static double CustoMensal(FaixaSolidaria x) {

        double custoDia = (((kmDia / consumoLitro) * precoGas) + txEstacDia);
        double numPessoas;
        double custoMensal = custoDia * 25;

        numPessoas = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de pessoas no veiculo para dividir a conta"));

        if (numPessoas == 0) {
            JOptionPane.showInputDialog("Veiculo Fantasma, nao e possivel calcular");
        } else if (numPessoas >= 1) {
            custoDia /= numPessoas;
            JOptionPane.showMessageDialog(null, "O valor mensal das despesas e " + String.format("%.2f", +(custoMensal * numPessoas)) + "\nCom o faixa solidaria dividido para " + numPessoas + "\nCada um vai pagar por mes " + String.format("%.2f", custoMensal));

        }

        return custoDia;

    }

    public static void main(String[] args) {

        FaixaSolidaria gol = new FaixaSolidaria("Fit", 30, 5.00, 0.0, 38);

        CustoMensal(gol);
    }

}
