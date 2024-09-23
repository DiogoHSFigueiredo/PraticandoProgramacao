/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package exelivrodeitelcap23;

/**
 *
 * @author Diogo
 */
//Interface Buffer especifica métodos chamados por Producer e Consumer
public interface Buffer {
//coloca o valor int no Buffer

    public void blockingPut(int value) throws InterruptedException;

//retorna o valor int a partir do Buffer
    public int blockingGet() throws InterruptedException;
}//fim da interface Buffer
