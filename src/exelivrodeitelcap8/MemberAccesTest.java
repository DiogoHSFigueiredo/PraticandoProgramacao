/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

/**
 *
 * @author Diogo
 */
public class MemberAccesTest {

    public static void main(String[] args) {

        Time1 time = new Time1(); //crima e inicializa o objeto Time1

        // entendendo o conceito de acesso a atributos // metodos com modificador de acesso privado, public e protected
        
        time.hour = 7; //erro: hour tem acesso privado em Time1
        time.minute = 15; //erro: minute tem acesso privado em Time1
        time.second = 30; // erro: second tem acesso privado em Time1

    }

} // fim da classe
