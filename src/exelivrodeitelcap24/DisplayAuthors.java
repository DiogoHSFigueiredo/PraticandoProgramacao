package exelivrodeitelcap24;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Diogo
 */
public class DisplayAuthors {

    public static void main(String[] args) {

        final String DATABASE_URL = "jdbc:mysql://localhost:3306/aulas";
        final String SELECT_QUERY = "SELECT AuthorID, FirstName, LastName FROM authors";

        //usa try com recursos para conectar-se e consultar o banco de dados
        try ( Connection connection = DriverManager.getConnection(DATABASE_URL, "root", "senhabanco2023@");  
                Statement statement = connection.createStatement();  
                ResultSet resultSet = statement.executeQuery(SELECT_QUERY)) {
            //obtem os metadados de ResultSet
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();

            System.out.printf("Authors Table of Books Database:%n%n");

            //exibe o nome de coluna no ResultSet
            for (int i = 1; i <= numberOfColumns; i++) {
                System.out.printf("%-8s\t", metaData.getColumnName(i));
            }
            System.out.println();

            //exibe os resultados da consulta
            
            while (resultSet.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-8s\t", resultSet.getObject(i));
                }
                System.out.println();
            }
        } //os metodos close dos objetos AutoCloseable sao chamados agora
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
} //fim da classe DisplayAuthors
