/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

/**
 *
 * @author Diogo
 */
public class Employe {

    private static int count = 0; // numero de Employes criados, instanciados, a partir da classe
    private String firstName;
    private String lastName;

    //inicializa Employe, adiciona 1 a static count e gera a saida de String indicando que o construtor foi chamado
    public Employe(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        ++count; // incrementa contagem no campo de classe 'static' count 
        System.out.printf("Employe constructor: %s %s; count = %d%n", firstName, lastName, count);

    }

    //obtém o primeiro nome
    public String getFirstName() {
        return firstName;

    }

    //obtém o ultimo nome
    public String getLastName() {
        return lastName;
    }

    //método estático para obter valor de contagem de estática
    public static int getCount() {
        return count;
    }

} // fim da classe
