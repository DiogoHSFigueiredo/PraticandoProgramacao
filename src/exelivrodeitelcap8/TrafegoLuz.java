/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

/**
 *
 * @author Diogo
 */
public class TrafegoLuz {

    //Declaração de constantes enum
    private final int RED;
    private final int GREEN;
    private final int YELLOW;

    //Construtor enum que recebe a duração de cada cor de luzes
    /**
     * Este metodo recebe tres parámetros para a duracao das cores
     *
     * @param red
     * @param green
     * @param yellow
     */
    public TrafegoLuz(int red, int green, int yellow) {
        this.RED = red;
        this.GREEN = green;
        this.YELLOW = yellow;

    }

    public String toString() {

        return String.format("%s %02d : %s %02d : %s %02d %n %s", "RED", this.RED, "GREEN", this.GREEN, "YELLOW", this.YELLOW, "Duracao das Luzes");

    }
}
