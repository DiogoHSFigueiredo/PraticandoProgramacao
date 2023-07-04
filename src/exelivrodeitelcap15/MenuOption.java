/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap15;

/**
 *
 * @author Diogo
 */
public enum MenuOption {

    //declara o conteudo do tipo enum
    ZERO_BALANCE(1),
    CREDIT_BALANCE(2),
    DEBIT_BALANCE(3),
    END(4);

    private final int value; //opcao atula de menu

    //construtor
    private MenuOption(int value) {
        this.value = value;
    }
} // fim do enum de MenuOption
