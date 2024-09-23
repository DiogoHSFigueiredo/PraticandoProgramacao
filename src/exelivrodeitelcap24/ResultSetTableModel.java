/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap24;

import javax.swing.table.AbstractTableModel;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 *
 * @author Diogo
 */
//Linhas e colunas do ResultSet sao contadas a partir de 1 e linhas e colunas JTable sao contadas a partir de 0. Ao processar linhas ou colunas de ResultSet para utilizacao em um JTable, é necessario adicionar 1 ao numero de linha ou coluna para manipular a coluna apropriada de ResultSet (isto é, coluna 0 de JTable é a coluna de ResultSet 1 e a linha de JTable 0 é a linha de ResultSet 1).
public class ResultSetTableModel extends AbstractTableModel {

    private final Connection connection;
    private final Statement statement;
    private ResultSet resultSet;
    private ResultSetMetaData metaData;
    private int numberOfRows;

    //monitora o status da conexao de banco de dados
    private boolean connectedToDatabase = false;

    //construtor inicializa resultSet e obtem seu objeto de meatadados. determina o numero de linhas
    public ResultSetTableModel(String url, String username, String password, String query) throws SQLException {

        //conecta-se ao banco de dados
        connection = DriverManager.getConnection(url, username, password);

        //cria Statement para consultar o banco de dados
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        //atualiza status de conexao de banco de dados
        connectedToDatabase = true;

        //configura consulta e a executa
        setQuery(query);
    }

    //obtem a classe que representa o tipo de coluna
    public Class getColumnClass(int column) throws IllegalStateException {

        //crtifica-se de que ha uma conexao disponivel com o banco de dados
        if (!connectedToDatabase) {
            throw new IllegalStateException("Not Connected to Database");
        }

        //determina a classe Java da coluna
        try {
            String className = metaData.getColumnClassName(column + 1);

            //retorna objeto Class que representa className
            return Class.forName(className);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return Object.class; //se ocorrerem os problemas acima, supoe tipo Object
    }

    //obtem numero de colunas em ResultSet
    public int getColumnCount() throws IllegalStateException {

        //certifica-se de que há uma conexao disponivel com o banco de dados
        if (!connectedToDatabase) {
            throw new IllegalStateException("Not connected to Database");
        }

        //determina numero de colunas
        try {
            return metaData.getColumnCount();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return 0; //se ocorrerem problemas, retorna string vazia para nome de coluna
    }

    //obtem nome de uma coluna particular em ResultSet
    public String getColumnName(int column) throws IllegalStateException {

        //certifica-se de que ha uma conexao disponivel com o banco de dados
        if (!connectedToDatabase) {
            throw new IllegalStateException("Not connected to Database");
        }

        //deternina o nome da coluna
        try {
            return metaData.getColumnName(column + 1);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return ""; //se ocorrerem problemas, retorna string vazia para nome de coluna
    }

    //retorna numero de linhas em ResultSet
    public int getRowCount() throws IllegalStateException {
        //certifica-se de que ha uma conexao disponivel com o banco de dados
        if (!connectedToDatabase) {
            throw new IllegalStateException("Not connected to Database");
        }
        return numberOfRows;
    }

    //obtem valor na linha e coluna especificadas
    public Object getValueAt(int row, int column) throws IllegalStateException {
        //certifica-se de que ha uma conexao disponivel com o banco de dados
        if (!connectedToDatabase) {
            throw new IllegalStateException("Not connected to Database");
        }
        //obtem um valor na linha e coluna de ResultSet especificada
        try {
            resultSet.absolute(row + 1);
            return resultSet.getObject(column + 1);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return ""; //se ocorrerem problemas, retorna objeto string vazio
    }

    //configura nova string de consulta de banco de dados
    public void setQuery(String query) throws SQLException, IllegalStateException {

        //certifica-se de que ha uma conexao disponivel com o banco de dados
        if (!connectedToDatabase) {
            throw new IllegalStateException("Not connected to Database");
        }

        //especifica consulta e a executa
        resultSet = statement.executeQuery(query);

        //obtem metadados para o ResultSet
        metaData = resultSet.getMetaData();

        //determina o numero de linhas em ResultSet
        resultSet.last(); //move para a ultima linha
        numberOfRows = resultSet.getRow(); //obtem numero de linha

        //notifica a JTable de que o modelo foi alterado
        fireTableStructureChanged();
    }

    //fecha Statement e Connection
    public void disconnectFromDatabase() {
        if (connectedToDatabase) {
            //fecha Statement e Connection
            try {
                resultSet.close();
                statement.close();
                connection.close();

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            } finally { //atualiza status de conexao de banco de dados
                connectedToDatabase = false;
            }
        }
    }
} //fim da classe ResultSetTableModel
