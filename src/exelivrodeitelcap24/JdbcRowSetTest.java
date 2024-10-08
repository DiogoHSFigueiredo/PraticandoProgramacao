/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Exibindo o conteudo da tabela Authors com JdbcRowSet.
package exelivrodeitelcap24;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

/**
 *
 * @author Diogo
 */
public class JdbcRowSetTest {

    //nome do driver JDBC e URL do banco de dados
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/aulas";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "senhabanco2023@";

    public static void main(String[] args) {

        //conecta-se ao banco de dados books e o consulta
        try ( JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet()) {

            //especifica as propriedades JdbcRowSet
            rowSet.setUrl(DATABASE_URL);
            rowSet.setUsername(USERNAME);
            rowSet.setPassword(PASSWORD);
            rowSet.setCommand("SELECT * FROM Authors"); //configura a consulta
            rowSet.execute(); //executa a consulta

            //processa resultados da consulta
            ResultSetMetaData metaData = rowSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            System.out.printf("Authors Table of Books Database:%n%n");

            //exibe o cabecalho rowset
            for (int i = 1; i <= numberOfColumns; i++) {
                System.out.printf("%-8s\t", metaData.getColumnName(i));
            }
            System.out.println();

            //exibe cada linha
            while (rowSet.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-8s\t", rowSet.getObject(i));
                }
                System.out.println();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.exit(1);
        }

    }
} //fim da classe JdbcRowSetTest
