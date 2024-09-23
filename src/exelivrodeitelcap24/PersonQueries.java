/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//PreparedStatements utilizadas pelo aplicativo de catálogo de endereços.
package exelivrodeitelcap24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Diogo
 */
public class PersonQueries {

    private static final String URL = "jdbc:mysql://localhost:3306/aulas";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "senhabanco2023@";

    private Connection connection; //gerencia a conexao
    private PreparedStatement selectAllPeople;
    private PreparedStatement selectPeopleByLastName;
    private PreparedStatement insertNewPerson;
    private PreparedStatement deletePerson;

    //construtor
    public PersonQueries() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            //cria a consulta que seleciona todas as entradas em AddressBook
            selectAllPeople = connection.prepareStatement("SELECT * FROM Addresses");

            //cria consulta que seleciona as entradas com um ultimo nome especifico
            selectPeopleByLastName = connection.prepareStatement("SELECT * FROM Addresses WHERE LastName = ?");

            //cria a inserção que adiciona uma nova entrada no banco de dados
            insertNewPerson = connection.prepareStatement("INSERT INTO Addresses " + "(FirstName, LastName, Email, PhoneNumber) " + "VALUES (?,?,?,?)");

            //cria a instrucao que deleta uma entrada no banco de dados
            deletePerson = connection.prepareStatement("DELETE FROM Addresses " + "WHERE addressID = ?");

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.exit(1);
        }
    }

    //seleciona todos os endereços no banco de dados
    public List< Person> getAllPeople() {

        List< Person> results = null;
        ResultSet resultSet = null;

        try {
            //executeQuery retorna o ResultSet contendo as entradas correspondentes
            resultSet = selectAllPeople.executeQuery();
            results = new ArrayList< Person>();

            while (resultSet.next()) {

                results.add(new Person(
                        resultSet.getInt("addressID"),
                        resultSet.getString("FirstName"),
                        resultSet.getString("LastName"),
                        resultSet.getString("Email"),
                        resultSet.getString("PhoneNumber")));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {

            try {

                resultSet.close();
            } catch (SQLException ex) {

                ex.printStackTrace();
                close();
            }
        }
        return results;
    }

    //seleciona a pessoa pelo sobrenome
    public List< Person> getPeopleByLastName(String name) {

        List<Person> results = null;
        ResultSet resultSet = null;

        try {

            selectPeopleByLastName.setString(1, name); //especifica o sobrenome

            //executeQuery retorna o ResultSet contendo as entradas correspondentes
            resultSet = selectPeopleByLastName.executeQuery();

            results = new ArrayList<Person>();

            while (resultSet.next()) {

                results.add(new Person(
                        resultSet.getInt("AddressID"),
                        resultSet.getString("FirstName"),
                        resultSet.getString("LastName"),
                        resultSet.getString("Email"),
                        resultSet.getString("PhoneNumber")));
            }
        } catch (SQLException ex) {

            ex.printStackTrace();
        } finally {

            try {

                resultSet.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                close();
            }
        }
        return results;
    }

    //adiciona uma entrada
    public int addPerson(String fname, String lname, String email, String num) {

        int result = 0;

        //configura parâmetros, entao executa insertNewPerson
        try {
            insertNewPerson.setString(1, fname);
            insertNewPerson.setString(2, lname);
            insertNewPerson.setString(3, email);
            insertNewPerson.setString(4, num);

            //insere a nova entrada; retorna n de linhas atualizadas
            result = insertNewPerson.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            close();
        }
        return result;
    }

    //deleta uma entrada
    public int deletePerson(int indexDelete) {

        int result = 0;
        String parametro = Integer.toString(indexDelete);
        //configura parametro, entao execura a deletePerson
        try {
            //configura a instrucao, e a executa
            deletePerson.setString(1, parametro);

            //deleta o registro e retorna o numero de linhas atualizadas
            result = deletePerson.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            close();
        }

        return result;
    }

    //fecha a conexao do banco de dados
    public void close() {
        try {
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
} //fim da classe PersonQueries
