/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

/**
 *
 * @author Diogo
 */
public class EmployeTest {

    public static void main(String[] args) {

        //mostra que a contagem e 0 antes de criar/instanciar Employes (objetos)
        System.out.printf("Employes before instantiation: %d%n", Employe.getCount());

        //cria dois Employes; a contagem deve ser 2
        Employe e1 = new Employe("Susan", "Baker");
        Employe e2 = new Employe("Bob", "Blue");

        //mostra que a contagem é 2 depois de criar dois Employes
        System.out.printf("%nEmployes after instantiation:%n");
        System.out.printf("via e1.getCount(): %d%n", e1.getCount()); //Chamada de metodo via objeto da classe
        System.out.printf("via e2.getCount(): %d%n", e2.getCount()); //Chamada de metodo via objeto da classe
        System.out.printf("Employe.getCount(): %d%n", Employe.getCount()); //Chamada de metodo via NomeDaClasse completo

        //obtém nomes de Employes
        System.out.printf("%nEmploye 1: %s %s%nEmploye 2: %s %s%n", e1.getFirstName(), e1.getLastName(), e2.getFirstName(), e2.getLastName());
    }
} // fim da classe
