/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;


/**
 *
 * @author Diogo Figueiredo
 */
// Declarando um tipo enum com um construtor e campos de instância explicitos e metodos de acesso para esses campos -
public enum Book {
    
    //declara constantes do tipo enum
    JHTP("Java how to Program", "2015"),
    CHTP("C how to Program", "2013"),
    IW3HTP("internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");
    
    //campos de instância
    private final String title; // título de livro
    private final String copyrightYear; // ano dos direitos autorais
    
    //construtor enum
    Book(String title, String copyrightYear){
        this.title = title;
        this.copyrightYear = copyrightYear;
    }
    
    //acessor para título de campo
    public String getTitle(){
        return title;
    }
    
    //acessor para campo copyrightYear
    public String getCopyrightYear(){
        return copyrightYear;
    }
    
} // fim  do enum Book
