/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

import java.util.Random;

/**
 *
 * @author Diogo
 */
public class TesteNumSerie {

    //cria objeto n para inicar um numero aleatorio
    static final Random n = new Random();

    //registra o numero de objetos criados na variavel de classe utilizando um sequencial inicial aleatorio
    protected static int numSerie = n.nextInt(1000);

    //Registra o sequencial inicial
    static final int SeqInicial = numSerie;

    //grava o numero de serie do objeto criado na variavel de instancia
    private final int Serie = numSerie;

    //construtor
    public TesteNumSerie() {

        //incrementa o numero sequencia para objetos criados
        numSerie++;
    }

    //retorna o numero sequencial do objeto
    public int NumSerie() {
        return (this.Serie);
    }

    //retorna o numero inicial do sequencial de produção
    public int SeqInicial() {
        return SeqInicial;
    }

} // fim da classe
