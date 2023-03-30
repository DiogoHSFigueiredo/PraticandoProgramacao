/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap7;

/**
 *
 * @author Diogo
 */
public class InityArrayComandLine {

    // Executar a partir do prompt
    
    public static void main(String[] args) {

        //verifica numero de argumentos da linha de comando
        if (args.length != 3) {
            System.out.printf("Error: Please re-enter theentire command, including%n" + " an array size, initial value and increment. %n");
        } else {
            //obtem o tamanho do array a partir do argumento da linha de comando
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];

            //obtem o valor inicial e o incremento a partir dos argumentos de linha de comando
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            //calcula o valor de cada elemento do array
            for (int counter = 0; counter < array.length; counter++) {
                array[counter] = initialValue + increment * counter;

            }
            System.out.printf("%s%8s%n", "index", "Value");
            //exibe o valor e o indice de array
            for (int counter = 0; counter < array.length; counter++) {
                System.out.printf("%5d%8d%n", counter, array[counter]);
            }
        }
    }
}
