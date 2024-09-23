/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap23;

import java.util.concurrent.ExecutionException;
import javax.swing.JLabel;
import javax.swing.SwingWorker;

/**
 *
 * @author Diogo
 */
public class BackgroundCalculator extends SwingWorker<Long, Object> {

    private final int n; //numero de Fibonacci a calcular
    private final JLabel resultJLabel; //JLabel para exibir o resultado

    //construtor
    public BackgroundCalculator(int n, JLabel resultJLabel) {

        this.n = n;
        this.resultJLabel = resultJLabel;

    }

    //codigo de longa duracao para ser executado em uma thread trabalhadora
    public Long doInBackground() {
        long nthFib;

        return nthFib = fibonacci(n);
    }

    //codigo a ser executado na thread de despacho de eventos quando doInBackground retorna
    protected void done() {
        try {
            //obtem o resultado de doInBackground e o exibe
            resultJLabel.setText(get().toString());
        } catch (InterruptedException ex) {
            resultJLabel.setText("Interrupted while waiting for results.");
        } catch (ExecutionException ex) {
            resultJLabel.setText("Error encountered while performing calculation");
        }
    }

    //metodo fibonacci recursivo; calcula o enesimo numero de Fibonacci
    public long fibonacci(long number) {
        if (number == 0 || number == 1) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
} //fim da classe BackgroundCalculator
